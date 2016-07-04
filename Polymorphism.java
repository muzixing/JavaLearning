

/**
 * Created by muzi on 7/2/16.
 */

abstract class Mammal{
    public abstract void eat();
}

class BigDog extends Mammal{
    public void eat(){
        System.out.println("eat meat");
    }

    public void work(){
        System.out.println("Watching");
    }
}

class Cat extends Mammal{
    public void eat(){
        System.out.println("eat fish");
    }

    public void work(){
        System.out.println("catch mise");
    }
}


public class Polymorphism {
    public static void show(Mammal a){
        a.eat();
        if (a instanceof Cat){
            Cat c = (Cat)a;
            c.work();
        }else if (a instanceof BigDog){
            BigDog d = (BigDog) a;
            d.work();
        }

    }

    public static void main(String args[]){
        show(new Cat());
        show(new BigDog());

        Mammal a = new Cat();
        a.eat();

        Cat c = (Cat)a;
        c.work();

    }   
}
