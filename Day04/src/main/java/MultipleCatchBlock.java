



public class MultipleCatchBlock {


    public static void main(String[] args) {
        int n=10;
        int []arr= new int[n];
        int []arr2=null;
        for(int i=0;i<n;i++)
        {
            arr[i]=i;
        }
        try{
            int value= arr[1];

            int value2= arr2[9];
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid Index :"+ e.getMessage());
        }
        catch(NullPointerException z)
        {
            System.out.println("Array is empty : "+ z.getMessage());
        }

    }
}
