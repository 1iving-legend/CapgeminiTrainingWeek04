import java.util.InputMismatchException;

public class UncheckedException {

    public static int divide(int a,int b )
    {

            int z=a/b;
            return z;
    }



    public static void main(String[] args) {
        try{
            System.out.println(divide(10, Integer.parseInt("a")));
            System.out.println("method executed properly");
        }
        catch(ArithmeticException v)
        {
            System.out.println("Arithimatic Exception occered :"+ v.getMessage());
        }
        catch(NumberFormatException m)
        {
            System.out.println("Input mismatch exception occered :"+ m.getMessage());
        }
    }


}
