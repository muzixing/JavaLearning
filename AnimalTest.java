
/**
 * Created by muzi on 7/2/16.
 */

class Animal{
    public void move() {
        System.out.println("Animal can move");
    }
}


class Dog extends Animal{
    public void move(){
        System.out.println("Dog can run");
        super.move();
    }

}

public class AnimalTest {
    public static void main(String args[]) {
        Dog bob = new Dog();
        bob.move();
    }
}
