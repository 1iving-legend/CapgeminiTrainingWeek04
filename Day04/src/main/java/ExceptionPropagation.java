public class ExceptionPropagation {

    public static void method1(){
        int z=10/0;
        System.out.println(z);
    }
    public static  void method2()
    {
        method1();
    }

    public static void main(String[] args) {
        try{
            method2();
        }
        catch (ArithmeticException e)
        {
            System.out.println("Exception occered :"+ e.getMessage());
        }
    }


}
