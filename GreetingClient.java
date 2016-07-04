import java.io.*;
import java.net.Socket;

/**
 * Created by muzi on 7/4/16.
 */
public class GreetingClient {
    public static void main(String [] args) {
        String serverName = args[0];
        int port = Integer.parseInt(args[1]);

        try {
            System.out.println("Connecting to " + serverName + ":" + port);
            Socket client = new Socket(serverName, port);

            OutputStream outToServer = client.getOutputStream();
            DataOutputStream out =  new DataOutputStream(outToServer);

            out.writeUTF("Hello from " + client.getLocalAddress());

            InputStream inFormServer = client.getInputStream();
            DataInputStream in = new DataInputStream(inFormServer);

            System.out.println("Server says: " + in.readUTF());
            client.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
