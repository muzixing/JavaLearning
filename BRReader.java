import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by muzi on 7/2/16.
 */
public class BRReader {
    public static void main(String args[]) throws IOException
    {
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 'end' to quit!");

        do {
            str = br.readLine();
            System.out.println(str);
        }while (!str.equals("end"));
    }
}
