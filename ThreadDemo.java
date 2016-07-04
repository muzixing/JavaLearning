/**
 * Created by muzi on 7/4/16.
 */


class NewThread implements  Runnable{
    Thread t;
    NewThread(){
        //  New the second thread.
        t = new Thread(this, "Demo test");
        System.out.println("Start Child thread: " + t);
        t.start();
    }

    public void run(){
        try {
            for (int i = 0; i <5; i++){
                System.out.println("Child Thread Printing number" + i);
                Thread.sleep(20);
            }
        }catch (InterruptedException e){
            System.out.println("Child thread interrupted.");
        }
        System.out.println("Child Thread Exiting");
    }
}


public class ThreadDemo {
    public static void main(String args[]){
        NewThread myThread = new NewThread();
        try {
            for (int i = 0; i < 5; i++){
                System.out.println("Main Thread Printing number" + i);
                Thread.sleep(30);
            }
        }catch (InterruptedException e){
            System.out.println("Main Thread Interrupted.");
        }
        System.out.println("Main Thread Exiting");
    }
}
