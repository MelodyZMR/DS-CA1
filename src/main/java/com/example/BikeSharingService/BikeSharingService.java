package com.example.BikeSharingService;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Random;


import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;



public class BikeSharingService extends BikeSharingServiceGrpc.BikeSharingServiceImplBase {

	public static void main(String[] args) throws InterruptedException, IOException {
		BikeSharingService service1 = new BikeSharingService();

		int port = 50054;

		Server server = ServerBuilder.forPort(port)
				.addService(service1)
				.build()
				.start();

		System.out.println("BikeSharingService started, listening on " + port);

		server.awaitTermination();
	}


	@Override
	public void  checkBikeAvailability(CheckBikeAvailabilityRequest request, StreamObserver<CheckBikeAvailabilityResponse> responseObserver) {
         
		String stationId = request.getStationId();
		 Random rand = new Random();
	        int availableBikes = rand.nextInt(20); // Random number of available bikes
	        
	        CheckBikeAvailabilityResponse response = CheckBikeAvailabilityResponse.newBuilder()
	                .setAvailableBikes(availableBikes)
	                .build();
	        
	        responseObserver.onNext(response);
	        responseObserver.onCompleted();
	    }
	
		
	public StreamObserver<ReserveAndUnlockBikeRequest> reserveAndUnlockBike(final StreamObserver<ReserveAndUnlockBikeResponse> responseObserver) {
		
		// server sets up a new observer that processes each client request when it sees onNext()  
			  	
		return new StreamObserver<ReserveAndUnlockBikeRequest>() {

			@Override
			public void onNext(ReserveAndUnlockBikeRequest request) {
			     String userId = request.getUserId();
	                String stationId = request.getStationId();
	                String reservationTime = request.getReservationTime();
	                System.out.println(LocalTime.now().toString() + ": receiving reserveAndUnlockBike request: "
	                        + "user_id: " + userId + ", station_id: " + stationId + ", reservation_time: " + reservationTime);
				
				//Use for loop to see how a server might handle multiple vehicle scheduling requests.
	                
	                Random rand = new Random();
	                for (int i = 0; i < 5; i++) {
					
	                	 String randomValueString = Integer.toString(rand.nextInt());
				 ReserveAndUnlockBikeResponse response = ReserveAndUnlockBikeResponse.newBuilder()
					        .setReservationId(randomValueString)
					        .setStatusCode(2)
					        .setBikeId(randomValueString)
					        .setUnlockExpirationTime(randomValueString)
					        .setUpdateMessage(randomValueString)
					        .build();
	                responseObserver.onNext(response);
	            }
				
			}

			@Override
			public void onError(Throwable t) {
				
				t.printStackTrace();
				
			}

			@Override
			public void onCompleted() {
				 System.out.println(LocalTime.now().toString() + ": receiving reserveAndUnlockBike completed ");
				
				//completed too
				responseObserver.onCompleted();
			}
			
		};
	}

	}
