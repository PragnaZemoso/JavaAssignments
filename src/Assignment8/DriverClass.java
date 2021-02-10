package Assignment8;

public class DriverClass {
    public static void main(String[] args) {
        Details details = new Details();

        try{
            details.validate("Pragna","123456ghj","1234567890");

            details.validate("123","123456ghj","1234567890"); //InvalidNameException
            //details.validate("QWERTY","123","9876543210"); // InvalidPasswordException
            //details.validate("Pragna","as12as12s","ASDF"); //InvalidMobileNumberException
            // details.validate("","",""); //NullPointerException
        }
        catch (Exception exception){
            System.out.println("Exception caught: "  + exception.getMessage());
            exception.printStackTrace();
        }
        finally{
            System.out.println("Finally block executed");
        }
    }
}
