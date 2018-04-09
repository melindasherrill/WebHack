import java.util.Scanner;
import java.util.Date;
import java.net.Socket;
import java.io.IOException;
import java.net.SocketException;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;


public class APflood {

	# ip header fields
	String packet = "";
	int source_ip = '10.1.10.1';
	int dest_ip = '10.1.12.173';
	int ip_ihl = 5;
	int ip_ver = 4;
	int ip_tos = 0;
	int ip_tot_len = 0; # kernel will fill the correct total lenght
	int ip_id = 54321;  #ID of this packet
	int ip_frag_off = 0
	int	ip_ttl = 255
	int	ip_proto = socket.IPPROTO_TCP
	int	ip_check = 0    # kernel will fill the correct checksum
	int	ip_saddr = socket.inet_aton ( source_ip );   #Spoof the source ip address if you want to
	int	ip_daddr = socket.inet_aton ( dest_ip );


	# tcp header fields
	int tcp_source = 1234;   #source port
	int	tcp_dest = 80;   # destination port
	int	tcp_seq = 454;
	int	tcp_ack_seq = 0;
	int	tcp_doff = 5;    #4 bit field, size of tcp header, 5 * 4 = 20 bytes
		#tcp flags
	int	tcp_fin = 0;
	int	tcp_syn = 1;
	int	tcp_rst = 0;
	int	tcp_psh = 0;
	int	tcp_ack = 0;
	int	tcp_urg = 0;
	int	tcp_window = socket.htons (5840);    #   maximum allowed window size
	int	tcp_check = 0;
	int	tcp_urg_ptr = 0;


	DataOutputStream user_data = 'Hello, how are you';

	# pseudo header fields
		String source_address = socket.inet_aton( source_ip );
		String dest_address = socket.inet_aton(dest_ip);
		int placeholder = 0;
		String protocol = socket.IPPROTO_TCP;
		String tcp_length = len(tcp_header) + len(user_data);


		public static main(String[]args) {

			for (end = time; end < 60; ++end) {
				
			}
		}





}