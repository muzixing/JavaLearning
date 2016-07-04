/**
 * Created by muzi on 7/4/16.
 */

class MyThread extends Thread{
    MyThread(){
        //  New the second thread.
        super("Dome thread test.");
        System.out.println("Start Child thread: ");
        start();
    }

    public void run(){
        try {
            for (int i = 0; i <5; i++){
                System.out.println("Child Thread Printing number" + i);
                Thread.sleep(30);
            }
        }catch (InterruptedException e){
            System.out.println("Child thread interrupted.");
        }
        System.out.println("Child Thread Exiting");
    }
}


public class ExtendThread {
    public static void main(String args[]){
        new MyThread();
        try {
            for (int i = 0; i < 5; i++){
                System.out.println("Main Thread Printing number" + i);
                Thread.sleep(20);
            }
        }catch (InterruptedException e){
            System.out.println("Main Thread Interrupted.");
        }
        System.out.println("Main Thread Exiting");
    }
}
