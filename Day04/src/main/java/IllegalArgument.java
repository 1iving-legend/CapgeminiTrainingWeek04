public class IllegalArgument {

 public static void  calculateInterest(double amount, double rate, int years) throws IllegalAccessException{

     if(amount<0 || rate<0 || years<0)
     throw  new IllegalArgumentException("Illegal Exception");

     else {
         System.out.println("Intrest : " + amount * rate * years / 100);
     }
    }

    public static void main(String[] args) {
        double amount= 1000000;
        double rate= -20;
        int year=5;
        try{
            calculateInterest(amount,rate,year);
        } catch (IllegalArgumentException e) {

            System.out.println("IllegalArgumentAcception occered :"+ e.getMessage());

        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
