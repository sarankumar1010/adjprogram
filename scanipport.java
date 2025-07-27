import java.io.IOException;
import java.net.Socket;
public class scanipport {
	public static void main(String[] args) {
    	String ipAddress = "127.0.0.1"; 
    	int startPort = 1;
    	int endPort = 1024; 
    	System.out.println("Scanning ports on " + ipAddress + " from " + startPort + " to " + endPort);
    	for (int port = startPort; port <= endPort; port++) {
        	try (Socket socket = new Socket(ipAddress, port)) {
                System.out.println("Port " + port + " is open");
        	} catch (IOException e) { }
    	}
        System.out.println("Port scanning completed.");
	}
}

