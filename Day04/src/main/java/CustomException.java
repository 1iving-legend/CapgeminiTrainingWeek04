
class ValidityException extends Exception{
    ValidityException(String message)
    {
        super(message);
    }
}

public class CustomException {

    public static void validAge(int age) throws ValidityException
    {
        if(age<18)
      throw new  ValidityException("Age must be greater than 18");
    }

    public static void main(String[] args) {
        try{
            validAge(15);
        } catch (ValidityException e) {
            System.out.println("Validity Exception occered :"+ e.getMessage());
        }
    }
}
