/**
 * Created by muzi on 7/4/16.
 */
public class ProducerConsumerTest {
    public static void main(String args[]) {
        CubbyHole c = new CubbyHole();
        Producer producer = new Producer(c, 1);
        Consumer consumer = new Consumer(c, 2);
        producer.start();
        consumer.start();
    }
}

