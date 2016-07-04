/**
 * Created by muzi on 7/4/16.
 */
public class Producer extends Thread {
    private CubbyHole cubbyhole;
    private int number;

    public Producer(CubbyHole c, int number) {
        cubbyhole = c;
        this.number = number;
    }

    public void run() {
        for (int i=1; i<10;i++) {
            cubbyhole.put(i);
            System.out.println("Producer :" + this.number + "put: " + i);
            try {
                sleep(10);
            }catch (InterruptedException e) {}
            }
        }
    }
