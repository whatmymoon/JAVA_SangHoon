package days18;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpIpClient02 {

	public static void main(String[] args) {
		
		String serverip = "192.168.0.74";
		
			Socket s;
			
			try {
				s = new Socket( serverip, 7777 );
				System.out.println("서버에 연결되었습니다.");
				
				Sender sender = new Sender(s);
				Receiver receiver = new Receiver(s);
				sender.start();
				receiver.start();
			} catch (UnknownHostException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}

}
