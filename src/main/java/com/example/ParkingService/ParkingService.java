package com.example.ParkingService;

import java.io.IOException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class ParkingService extends ParkingServiceGrpc.ParkingServiceImplBase{
		

		public static void main(String[] args) throws InterruptedException, IOException {
			ParkingService service1 = new ParkingService();

			int port = 50053;

			Server server = ServerBuilder.forPort(port)
					.addService(service1)
					.build()
					.start();

			System.out.println("ParkingService started, listening on " + port);

			server.awaitTermination();
		}


		@Override
		public void findAvailableParkingSpace(ParkingLotRequest request, StreamObserver<ParkingLotResponse> responseObserver) {
			String parkingLotId = request.getParkingLotId();
			Random rand = new Random();
			
			int availableSpaces = rand.nextInt(51);
			
			//preparing the response message
			ParkingLotResponse response =ParkingLotResponse.newBuilder()
					.setAvailableSpaces(20)
					.setTotalSpaces(50)
					.build();

			responseObserver.onNext(response ); 

			responseObserver.onCompleted();
			
			
			

		}


		@Override
		public StreamObserver<ParkingReservationRequest> bookParkingSpaces(StreamObserver<ParkingReservationResponse> responseObserver) {
		    //Use to store all requests
			List<ParkingReservationRequest> reserveList = new ArrayList<>();

			return new StreamObserver<ParkingReservationRequest>() {
				
				//// when a new request received , put it into the array
			 @Override
	            public void onNext(ParkingReservationRequest request) {
				 System.out.println(LocalTime.now().toString() + ": received a ParkingReservationRequest for parking lot: " 
                         + request.getParkingLotId());
				 reserveList.add(request);
	               
	            }
			
			@Override
			public void onError(Throwable t) {
				t.printStackTrace();

			}

			@Override
			public void onCompleted() {
				 System.out.println(LocalTime.now().toString() + ": receiving reservation completed ");
			}
			  int totalReservations = reserveList.size();
			  ParkingReservationResponse response = ParkingReservationResponse.newBuilder()
                      .setConfirmationId("ConfirmationID12345")
                      .setReservationStatus("SUCCESS")
                      .build();
			  
			
			};
			
		};
	
		}
