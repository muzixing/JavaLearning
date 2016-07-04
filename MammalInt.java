
/**
 * Created by muzi on 7/2/16.
 */
public class MammalInt implements AnimalInterface{
    public void eat(){
        System.out.println("Eat some thing");

    }

    public void travel(){
        System.out.println("Travel to US");
    }

    public static void main(String args[]){
        MammalInt m = new MammalInt();
        m.eat();
        m.travel();
    }

}
