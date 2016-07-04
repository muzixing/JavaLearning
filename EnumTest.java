/**
 * Created by muzi on 6/17/16.
 */

class FreshJuice{
    enum FreshJuiceSize{ SMALL, MEDUIM, LARGE}
    FreshJuiceSize size;
}

public class EnumTest {
    public static void main(String [] args ){
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.LARGE;
        System.out.print(juice.size);

    }

}
