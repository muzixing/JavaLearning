
/**
 * Created by muzi on 7/2/16.
 */
public class VarargsDemo {
    public static void printMax(double... numbers){
        if (numbers.length == 0){
            System.out.print("No Argument Parsed");
            return;
        }

        Double result  = numbers[0];
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > result){
                result = numbers[i];
            }
        }
        System.out.println("Max Value is : " + result);
    }


    public static void main(String args[]){
        printMax(1, 3, 19, 11);
        printMax(new double[] {1, 2, 3, 4});

    }

}
