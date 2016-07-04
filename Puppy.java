/**
 * Puppy is a test calss, which can create object.
 * Created by muzi on 6/19/16.
 */
public class Puppy {
    String puppyName;
    Integer puppyAge;
    public Puppy(String name){
        // This is a constructor.
        System.out.println("Passed name is  :" + name);
        puppyName = name;
    }

    public void setAge(int age){
        puppyAge = age;
    }

    public int getAge(){
        System.out.println("Puppy's age is :" + puppyAge);
        return puppyAge;
    }

    public static void main(String []args){
        // Main method will create a Puppy object.
        Puppy myPuppy = new Puppy("ChengLi");
        System.out.print(myPuppy.puppyName);
        myPuppy.setAge(2);
        myPuppy.getAge();
        System.out.println("Variable Value :" + myPuppy.puppyAge);
    }
}
