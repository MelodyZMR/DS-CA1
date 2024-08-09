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
				
				//Use for loop to see how a client might handle multiple vehicle scheduling requests.
	                
	    			
	                for (int i = 0; i < 5; i++) {
					//Use i+1 ,because i = 0,I don't want number start from 0.
				 ReserveAndUnlockBikeResponse response = ReserveAndUnlockBikeResponse.newBuilder()
					        .setReservationId("Reservation" + (i + 1))//i=0,i+1 means ID starts from number1.
					        .setStatusCode(2)
					        .setBikeId("BikeId" + (i + 1))
					        .setUnlockExpirationTime((i + 1) * 5 + " minutes")
					        .setUpdateMessage("Reservation update" + (i + 1))
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
