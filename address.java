import java.net.*;
public class inetaddress {
	public static void main(String[] args) {
    	try {
        	String website = "www.google.com";
        	 InetAddress inet = InetAddress.getByName(website);
        	System.out.println("Website: " + website);
            System.out.println("Host Name: " + inet.getHostName());
            System.out.println("IP Address: " + inet.getHostAddress());
    	} catch (UnknownHostException e) {
            System.out.println("Website not found: " + e.getMessage());
    	}
	}
}
