import jdk.nashorn.internal.objects.annotations.Constructor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

/**
 * Created by muzi on 7/4/16.
 */
public class GreetingServer extends Thread {
    private ServerSocket serverSocket;

    public GreetingServer (int port) throws IOException {
        serverSocket = new ServerSocket(port);
        serverSocket.setSoTimeout(10000);
    }

    @Override
    public void run() {
        while (true) {
            try {
                int port =  serverSocket.getLocalPort();
                System.out.println("Waiting for connect on port " + port + "...");
                Socket server = serverSocket.accept();

                System.out.println(server.getRemoteSocketAddress() + " connected");

                DataInputStream in = new DataInputStream(server.getInputStream());
                System.out.println(in.readUTF());

                DataOutputStream out = new DataOutputStream(server.getOutputStream());
                out.writeUTF("Thank you for connecting " + server.getLocalAddress());
                server.close();
            } catch (SocketTimeoutException s) {
                System.out.println("Socket timed out.");
                break;
            } catch (IOException e) {
                e.printStackTrace();
                break;
            }
        }
    }

    public static void main(String [] args) {
        int port = Integer.parseInt(args[0]);
        try {
            Thread t = new GreetingServer(port);
            t.start();
        } catch (IOException e) {
          e.printStackTrace();
        }
    }
}
