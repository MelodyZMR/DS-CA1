package com.example.PublicTransportationService;
import java.io.IOException;

import java.time.LocalTime;
import java.util.Random;

//import com.example.ParkingService.ParkingReservationRequest;


import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;



public class PublicTransportationService extends PublicTransportationServiceGrpc.PublicTransportationServiceImplBase{
		

		public static void main(String[] args) throws InterruptedException, IOException {
			PublicTransportationService service1 = new PublicTransportationService();

			int port = 50055;

			Server server = ServerBuilder.forPort(port)
					.addService(service1)
					.build()
					.start();

			System.out.println("PublicTransportationService started, listening on " + port);

			server.awaitTermination();
		}
         
		

		@Override
		public void getRealTimeTransitInfo(GetRealTimeInfoRequest request,StreamObserver<StopArrivalTimeResponse> responseObserver) {
			// TODO Auto-generated method stub
			
			 String vehicleId = request.getVehicleId();
			StopArrivalTimeResponse response =StopArrivalTimeResponse.newBuilder()
					.setStopId("Stop000")
					.setCurrentLocation("Connelly")
					.setEstimatedMinutes (10)
					.build();

			responseObserver.onNext(response ); 

			responseObserver.onCompleted();
		}



		@Override
		//StreamObserver method ,Server can send multiple responses to client,not only one.
		public void dispatchVehicle(DispatchVehicleRequest request, StreamObserver<DispatchVehicleResponse> responseObserver) {
			System.out.println(LocalTime.now().toString() + " : receiving convert request with values : " + request.getVehicleType() +  " " + request.getDestinationLocation());
			Random rand = new Random();
  //Use for loop to see how a server might handle multiple vehicle scheduling requests.
			  for (int i = 0; i < 7; i++) {
				  String randomValueString = Integer.toString(rand.nextInt());//it will create a random value,and convert to string.
		            DispatchVehicleResponse response = DispatchVehicleResponse.newBuilder()
		                    .setVehicleId(randomValueString)
		                    .setEstimatedArrivalTime(randomValueString) 
		                    .build();
				
				//slow it all down a bit so we can observe the behaviour 
				try {
					//wait for a second
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					//send"DispatchVehicleResponse" to client in each loop
					responseObserver.onNext(response ); 
				}
				
			}
			// signal that there are no more responses
			responseObserver.onCompleted();
		}
}

	

	
	



