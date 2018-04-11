import java.util.Scanner;
import java.util.Date;
import java.net.Socket;
import java.io.IOException;
import java.net.SocketException;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;


public class APflood {

public static void main(String[] args) {
	//ip header fields
	int s = 0;
	boolean num = true;
	String packet = "";
	String source_ip = "10.1.10.1";
	String dest_ip = "10.1.12.173";
	int ip_ihl = 5;
	int ip_ver = 4;
	int ip_tos = 0;
	int ip_tot_len = 0; //kernel will fill the correct total lenght
	int ip_id = 54321;  //ID of this packet
	int ip_frag_off = 0;
	int	ip_ttl = 255;
	int	ip_proto = socket.IPPROTO_TCP;
	int	ip_check = 0;    //kernel will fill the correct checksum
	int	ip_saddr = socket.inet_aton ( source_ip );   //Spoof the source ip address if you want to
	int	ip_daddr = socket.inet_aton ( dest_ip );


	//tcp header fields
	int tcp_source = 1234;   //source port
	int	tcp_dest = 80;   //destination port
	int	tcp_seq = 454;
	int	tcp_ack_seq = 0;
	int	tcp_doff = 5;    //4 bit field, size of tcp header, 5 * 4 = 20 bytes
		//tcp flags
	int	tcp_fin = 0;
	int	tcp_syn = 1;
	int	tcp_rst = 0;
	int	tcp_psh = 0;
	int	tcp_ack = 0;
	int	tcp_urg = 0;
	int	tcp_window = socket.htons (5840);    // maximum allowed window size
	int	tcp_check = 0;
	int	tcp_urg_ptr = 0;
	
	int tcp_offset_res = (tcp_doff << 4) + 0;
	int tcp_flags = tcp_fin + (tcp_syn << 1) + (tcp_rst << 2) + (tcp_psh << 3) + (tcp_ack << 4) + (tcp_urg << 5); 





	DataOutputStream user_data = "Hello, how are you";

	// pseudo header fields
	String source_address = socket.inet_aton( source_ip );
	String dest_address = socket.inet_aton(dest_ip);
	int placeholder = 0;
	String protocol = socket.IPPROTO_TCP;
	String tcp_length = len(tcp_header) + len(user_data);
	String psh = pack("!4s4sBBH", source_address, dest_address, placeholder, protocol, tcp_length);
	String psh = psh + tcp_header + user_data;



	


		try {
			s = socket.socket(socket.AF_INET, socket.SOCK_RAW, socket.IPPROTO_RAW);
		}
			catch (InterruptedExceptoin e) {
				System.out.println("Error, Socket could not be created. Error Code: " + e); //add error code
				}
			
				 if(num = true) {
					Syste.out.println("Sucess!");
				}
			//}

		//public int checkSum(String msg) {
			//for (int i = 0; i < msg.length(); ++i)
//			{

			


		
		//}
	









		//public static main(String[]args) {

			//for (end = time; end < 60; ++end) {
				
			
		





