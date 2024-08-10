package GuiClient;

import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import java.util.Iterator;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.example.BikeSharingService.BikeSharingServiceGrpc;
import com.example.BikeSharingService.CheckBikeAvailabilityRequest;
import com.example.BikeSharingService.CheckBikeAvailabilityResponse;
import com.example.BikeSharingService.ReserveAndUnlockBikeRequest;
import com.example.BikeSharingService.ReserveAndUnlockBikeResponse;
import com.example.ParkingService.ParkingLotRequest;
import com.example.ParkingService.ParkingLotResponse;
import com.example.ParkingService.ParkingReservationRequest;
import com.example.ParkingService.ParkingReservationResponse;
import com.example.ParkingService.ParkingServiceGrpc;
import com.example.ParkingService.ParkingServiceGrpc.ParkingServiceStub;
import com.example.PublicTransportationService.GetRealTimeInfoRequest;
import com.example.PublicTransportationService.PublicTransportationServiceGrpc;
import com.example.PublicTransportationService.StopArrivalTimeResponse;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

   public class ControllerGUIclient implements ActionListener {
	    private JTextField userIdField;
	    private JTextField parkingLotIdField;
	    private JTextField reservationTimeField;

       private JTextField parkingLotRequest, parkingAvailabilityResponse;
       private JTextField ParkingReservationtRequest, ParkingReservationRequestResponse;
      private JTextField realTimeInfoRequest, stopArrivalTimeResponse;
      private JTextField DispatchVehicleRequest, DispatchVehicleResponse;
      private JTextField checkBikeAvailabilityRequest, checkBikeAvailabilityResponse;
      private JTextField reserveAndUnlockBikeRequest, reserveAndUnlockBikeResponse;

  public static void main(String[] args) {
      new ControllerGUIclient().build();
     }

   private void build() {
      JFrame frame = new JFrame("Smart City Controller");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

     JPanel panel = new JPanel();
     BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
     panel.setLayout(boxlayout);
     panel.setBorder(new EmptyBorder(new Insets(50, 100, 50, 100)));

     panel.add(getparkingAvailabilityResponse());
     panel.add(getParkingReservationRequestResponse());
     panel.add(getstopArrivalTimeResponse());
     panel.add(getDispatchVehicleResponse());
     panel.add(getBikeAvailabilityResponse());
     panel.add(getReserveAndUnlockBikeResponse());

     frame.add(panel);
     frame.pack();
     frame.setVisible(true);
   }

   private JPanel getparkingAvailabilityResponse() {
      JPanel panel = new JPanel();
      BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

      JLabel label = new JLabel("Parking Lot ID:");
      panel.add(label);
      panel.add(Box.createRigidArea(new Dimension(10, 0)));
      parkingLotRequest = new JTextField("", 10);
      panel.add(parkingLotRequest);
      panel.add(Box.createRigidArea(new Dimension(10, 0)));

     JButton button = new JButton("Get Parking Availability");
     button.addActionListener(this);
     panel.add(button);
     panel.add(Box.createRigidArea(new Dimension(10, 0)));

    parkingAvailabilityResponse = new JTextField("", 20);
    parkingAvailabilityResponse.setEditable(false);
    panel.add(parkingAvailabilityResponse);

     panel.setLayout(boxlayout);
     return panel;
     }

  private JPanel getParkingReservationRequestResponse() {
    JPanel panel = new JPanel();
    BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);

    // User ID
    JLabel userIdLabel = new JLabel("User ID:");
    panel.add(userIdLabel);
    panel.add(Box.createRigidArea(new Dimension(10, 0)));
    JTextField userIdField = new JTextField("", 10);
    panel.add(userIdField);
    panel.add(Box.createRigidArea(new Dimension(10, 0)));

    // Parking Lot ID
    JLabel parkingLotIdLabel = new JLabel("Parking Lot ID:");
    panel.add(parkingLotIdLabel);
    panel.add(Box.createRigidArea(new Dimension(10, 0)));
    JTextField parkingLotIdField = new JTextField("", 10);
    panel.add(parkingLotIdField);
    panel.add(Box.createRigidArea(new Dimension(10, 0)));

    // Reservation Time
    JLabel reservationTimeLabel = new JLabel("Reservation Time:");
    panel.add(reservationTimeLabel);
    panel.add(Box.createRigidArea(new Dimension(10, 0)));
    JTextField reservationTimeField = new JTextField("", 10);
    panel.add(reservationTimeField);
    panel.add(Box.createRigidArea(new Dimension(10, 0)));

    // Submit Button
    JButton button = new JButton("Reserve Parking");
    button.addActionListener(this);
    panel.add(button);
    panel.add(Box.createRigidArea(new Dimension(10, 0)));

    ParkingReservationRequestResponse = new JTextField("", 20);
    ParkingReservationRequestResponse.setEditable(false);
    panel.add(ParkingReservationRequestResponse);

    panel.setLayout(boxlayout);
    return panel;
    }

   private JPanel getstopArrivalTimeResponse() {
    JPanel panel = new JPanel();
    BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

    JLabel label = new JLabel("Vehicle ID:");
   panel.add(label);
   panel.add(Box.createRigidArea(new Dimension(10, 0)));
   realTimeInfoRequest = new JTextField("", 10);
   panel.add(realTimeInfoRequest);
   panel.add(Box.createRigidArea(new Dimension(10, 0)));

   JButton button = new JButton("Real-Time Info");
   button.addActionListener(this);
   panel.add(button);
   panel.add(Box.createRigidArea(new Dimension(10, 0)));

   stopArrivalTimeResponse = new JTextField("", 20);
   stopArrivalTimeResponse.setEditable(false);
   panel.add(stopArrivalTimeResponse);

   panel.setLayout(boxlayout);
   return panel;
   }

  private JPanel getDispatchVehicleResponse() {
     JPanel panel = new JPanel();
     BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

     JLabel label = new JLabel("Vehicle Type:");
     panel.add(label);
     panel.add(Box.createRigidArea(new Dimension(10, 0)));
     DispatchVehicleRequest = new JTextField("", 10);
     panel.add(DispatchVehicleRequest);
     panel.add(Box.createRigidArea(new Dimension(10, 0)));

     JButton button = new JButton("Dispatch Vehicle");
     button.addActionListener(this);
     panel.add(button);
     panel.add(Box.createRigidArea(new Dimension(10, 0)));

     DispatchVehicleResponse = new JTextField("", 20);
     DispatchVehicleResponse.setEditable(false);
     panel.add(DispatchVehicleResponse);

    panel.setLayout(boxlayout);
    return panel;
    }

   private JPanel getBikeAvailabilityResponse() {
      JPanel panel = new JPanel();
      BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

      JLabel label = new JLabel("StationId:");
      panel.add(label);
      panel.add(Box.createRigidArea(new Dimension(10, 0)));
      checkBikeAvailabilityRequest = new JTextField("", 10);
      panel.add(checkBikeAvailabilityRequest);
      panel.add(Box.createRigidArea(new Dimension(10, 0)));

     JButton button = new JButton("Check Bike Availability");
     button.addActionListener(this);
     panel.add(button);
     panel.add(Box.createRigidArea(new Dimension(10, 0)));

     checkBikeAvailabilityResponse = new JTextField("", 20);
     checkBikeAvailabilityResponse.setEditable(false);
     panel.add(checkBikeAvailabilityResponse);

     panel.setLayout(boxlayout);
     return panel;
   }

  private JPanel getReserveAndUnlockBikeResponse() {
     JPanel panel = new JPanel();
     BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

    JLabel label = new JLabel("Reserve and Unlock Bike:");
    panel.add(label);
    panel.add(Box.createRigidArea(new Dimension(10, 0)));
    reserveAndUnlockBikeRequest = new JTextField("", 10);
    panel.add(reserveAndUnlockBikeRequest);
    panel.add(Box.createRigidArea(new Dimension(10, 0)));

   JButton button = new JButton("Reserve and Unlock");
   button.addActionListener(this);
   panel.add(button);
   panel.add(Box.createRigidArea(new Dimension(10, 0)));

   reserveAndUnlockBikeResponse = new JTextField("", 20);
   reserveAndUnlockBikeResponse.setEditable(false);
   panel.add(reserveAndUnlockBikeResponse);

   panel.setLayout(boxlayout);
   return panel;
   }

   @Override
   public void actionPerformed(ActionEvent e) {
     JButton button = (JButton) e.getSource();
     String label = button.getText(); 
     
     switch (label) {
     case "Get Parking Availability":
     handlegetparkingAvailabilityResponse();
     break;
     case "Reserve Parking":
     handlegetParkingReservationRequestResponse();
     break;
     case "Real-Time Info":
     handlegetstopArrivalTimeResponse();
     break;
     case "Dispatch Vehicle":
     handlegetDispatchVehicleResponse();
     break;	
     case "Check Bike Availability":
     handleBikeSharingService1();
     break;
     case "Reserve and Unlock":
     handleBikeSharingService2();
     break;
     }

}

  //GRPC Client
    private void handlegetparkingAvailabilityResponse() {
    	System.out.println("ParkingService to be invoked with " + parkingLotRequest.getText());
       ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50053).usePlaintext().build();
       ParkingServiceGrpc.ParkingServiceBlockingStub blockingStub = ParkingServiceGrpc.newBlockingStub(channel);

      ParkingLotRequest request = ParkingLotRequest.newBuilder()
      .setParkingLotId(parkingLotRequest.getText())
      .build();

      ParkingLotResponse response = blockingStub.findAvailableParkingSpace(request);
      parkingAvailabilityResponse.setText("Available Spaces: " + response.getAvailableSpaces() + 
      ", Total Spaces: " + response.getTotalSpaces());
      channel.shutdown();
      }

   
    private void  handlegetParkingReservationRequestResponse() {
      ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50053).usePlaintext().build();
      ParkingServiceStub asyncStub = ParkingServiceGrpc.newStub(channel);

     StreamObserver<ParkingReservationResponse> responseObserver = new StreamObserver<ParkingReservationResponse>() {
     @Override
      public void onNext(ParkingReservationResponse response) {
        ParkingReservationRequestResponse.setText("Confirmation ID: " + response.getConfirmationId() +
                ", Status: " + response.getReservationStatus());
     }
      @Override
	  public void onError(Throwable t) {
		t.printStackTrace();
	  }

	  @Override
	   public void onCompleted() {
	  	System.out.println(LocalTime.now().toString() + ": stream is completed.");
	   }

       }; 
      StreamObserver<ParkingReservationRequest> requestObserver = asyncStub.bookParkingSpaces(responseObserver);

      try {
     
    String userId = userIdField.getText();
    String parkingLotId = parkingLotIdField.getText();
    String reservationTime = reservationTimeField.getText();
    
    ParkingReservationRequest request = ParkingReservationRequest.newBuilder()
            .setUserId(userId) 
            .setParkingLotId(parkingLotId)
            .setReservationTime(reservationTime)
            .build();
    requestObserver.onNext(request);

   
    requestObserver.onCompleted();

     } catch (RuntimeException e) {
   
    requestObserver.onError(e);
    throw e;
    }
     }


    private void handlegetstopArrivalTimeResponse() {
    	System.out.println("PublicTransportationService to be invoked with " + realTimeInfoRequest.getText());
      ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50055).usePlaintext().build();
      PublicTransportationServiceGrpc.PublicTransportationServiceBlockingStub blockingStub =PublicTransportationServiceGrpc.newBlockingStub(channel);

      GetRealTimeInfoRequest request = GetRealTimeInfoRequest.newBuilder()
      .setVehicleId(realTimeInfoRequest.getText())
      .build();

       StopArrivalTimeResponse response = blockingStub.getRealTimeTransitInfo(request);
       stopArrivalTimeResponse.setText("StopId: " + response.getStopId() + 
      ", Location: " + response.getCurrentLocation()+", Estimated-Minutes: " + response.getEstimatedMinutes());
      channel.shutdown();
       }


     private void handlegetDispatchVehicleResponse() {
         ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50055).usePlaintext().build();
        PublicTransportationServiceGrpc.PublicTransportationServiceBlockingStub blockingStub =PublicTransportationServiceGrpc.newBlockingStub(channel);

         GetRealTimeInfoRequest request = GetRealTimeInfoRequest.newBuilder()
        .setVehicleId(realTimeInfoRequest.getText())
        .build();

        StopArrivalTimeResponse response = blockingStub.getRealTimeTransitInfo(request);
        stopArrivalTimeResponse.setText("StopId: " + response.getStopId() + 
        ", Location: " + response.getCurrentLocation()+", Estimated-Minutes: " + response.getEstimatedMinutes());
       channel.shutdown();
       }



   private void handleBikeSharingService1() {
	   System.out.println("BikeSharingServie to be invoked with " + checkBikeAvailabilityRequest.getText());
     ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50054).usePlaintext().build();
     BikeSharingServiceGrpc.BikeSharingServiceBlockingStub blockingStub = BikeSharingServiceGrpc.newBlockingStub(channel);

     CheckBikeAvailabilityRequest request = CheckBikeAvailabilityRequest.newBuilder()
     .setStationId(checkBikeAvailabilityRequest.getText())
      .build();

     CheckBikeAvailabilityResponse response = blockingStub.checkBikeAvailability(request);
    checkBikeAvailabilityResponse.setText("Available Bikes: " + response.getAvailableBikes());
     channel.shutdown();
     }
  
   private void handleBikeSharingService2() {
   ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50054).usePlaintext().build();
    BikeSharingServiceGrpc.BikeSharingServiceStub asyncStub = BikeSharingServiceGrpc.newStub(channel);

   ReserveAndUnlockBikeRequest request = ReserveAndUnlockBikeRequest.newBuilder()
   .setUserId(reserveAndUnlockBikeRequest.getText()) 
   .setStationId(reserveAndUnlockBikeRequest.getText())
   .setReservationTime(reserveAndUnlockBikeRequest.getText())
   .build();

  }
  public void onNext(ReserveAndUnlockBikeResponse response) {
  reserveAndUnlockBikeResponse.setText("Reservation ID: " + response.getReservationId() +
  ", Status Code: " + response.getStatusCode() +
  ", Bike ID: " + response.getBikeId() +
  ", Unlock Expiration Time: " + response.getUnlockExpirationTime() +
  ", Update Message: " + response.getUpdateMessage());
  }

   public void onError(Throwable t) {
   t.printStackTrace();
  }

  public void onCompleted() {
  System.out.println("All responses are received");
 }
 }

