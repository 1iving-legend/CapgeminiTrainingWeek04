public class NestedTryCatch {

    public  static void arrayMethod(int []arr, int diviser, int index){
        arr[index]= arr[index]/diviser;
        System.out.println("Executed sucessfully");
    }

    public static void main(String[] args) {

        int arr[] = {5,7,9,46,69,78,63};
        try{
           try{ arrayMethod(arr,0,0);}
           catch(NullPointerException e)
           {
               System.out.println("Nullpointer Exception occered "+e.getMessage() );
           }
           catch(ArrayIndexOutOfBoundsException e)
           {
               System.out.println("IndexOutOfBoundsException occered "+e.getMessage() );
           }

        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithimetic Exception occered "+e.getMessage() );
        }
    }


}
