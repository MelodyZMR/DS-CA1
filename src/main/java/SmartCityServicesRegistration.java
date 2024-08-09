
import java.io.IOException;
import java.net.InetAddress;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

import com.example.ParkingService.ParkingService;

// This code is adapted from https://github.com/jmdns/jmdns
public class SmartCityServicesRegistration {

    public static void main(String[] args) throws InterruptedException {

        try {
            // Create a JmDNS instance
            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
			System.out.println("Registration: InetAddress.getLocalHost():" + InetAddress.getLocalHost());
 
			   
            // Register  services
            ServiceInfo serviceInfo = ServiceInfo.create("_parking._tcp.local.", "ParkingService", 50053, "path=/parking");
            jmdns.registerService(serviceInfo);
            System.out.println("Registered ParkingService:" + InetAddress.getLocalHost() + serviceInfo.getPort());
             
            
            // Wait a bit
            Thread.sleep(2000);
         

            
            // Register  services
            ServiceInfo publicTransportationServiceInfo = ServiceInfo.create("_transport._tcp.local.", "PublicTransportationService", 50052, "path=/transport");
            jmdns.registerService(publicTransportationServiceInfo);
            System.out.println("Registered PublicTransportationService: " + InetAddress.getLocalHost() + ":" + publicTransportationServiceInfo.getPort());
      
            // Wait a bit
            Thread.sleep(2000);
            
         //Register  services
          
            ServiceInfo bikeSharingServiceInfo = ServiceInfo.create("_bike._tcp.local.", "BikeSharingService", 50054, "path=/bike");
            jmdns.registerService(bikeSharingServiceInfo);
            System.out.println("Registered BikeSharingService: " + InetAddress.getLocalHost() + ":" + bikeSharingServiceInfo.getPort());
            
            // Wait a bit
            Thread.sleep(2000);
            
            // Unregister all services
            //jmdns.unregisterAllServices();
            

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}



