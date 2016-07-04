import java.util.Date;


/**
 * Created by muzi on 7/2/16.
 */
public class SleepTest {
    public static void main(String argv[]){
        try{
            System.out.println(new Date() + "\n");
            Thread.sleep(1000 * 2);
            System.out.println(new Date() + "\n");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
