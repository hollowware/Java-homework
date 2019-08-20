package op032_Chat;

import java.io.*;
import java.net.*;

public class BarelyAliveNarco {
	public static void main(String[] args) {
        try(Socket socket = new Socket("localhost", 777);
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){
            String stringOne = "", stringTwo = "";
            while(!stringOne.equals("Deal")){
                stringOne = bufferedReader.readLine();
                dataOutputStream.writeUTF(stringOne);
                WriteToFile.writeClientInfoToFile(("Barely Alive Narco:  " + stringOne), "Drug_deal.txt");
                dataOutputStream.flush();
                stringTwo = dataInputStream.readUTF();
                System.out.println("Barely Alive Narco says: " + stringTwo);
            }
        }catch (Exception ex){
            System.out.println(ex);
        }
    }
}
