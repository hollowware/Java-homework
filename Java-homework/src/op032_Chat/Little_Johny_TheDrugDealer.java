package op032_Chat;

import java.io.*;
import java.net.*;

public class Little_Johny_TheDrugDealer {
	public static void main(String[] args) {
		try (ServerSocket serverSocket = new ServerSocket(777);
		     Socket socket = serverSocket.accept();
	         DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
	         DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
	         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
			 String stringOne = "", stringTwo = "";
	         while (!stringOne.equals("Deal")) {
	             stringOne = dataInputStream.readUTF();
	             System.out.println("Little Johny says: " + stringOne);
	             stringTwo = bufferedReader.readLine();
	             dataOutputStream.writeUTF(stringTwo);
	             WriteToFile.writeClientInfoToFile(("Little Johny:  " + stringTwo), "Drug_deal.txt");
	             dataOutputStream.flush();
	        }
	        } catch (Exception ex) {
	            System.out.println(ex);
	        }
	}
}
