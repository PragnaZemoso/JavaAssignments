package Assignment8;

public class Details{

    public void validate(String name ,String password, String mobileNumber) throws Exception{
        if(name.isEmpty() || password.isEmpty() || mobileNumber.isEmpty())
            throw new NullPointerException(" Null Exception ");

        if(!name.matches("[a-zA-Z]*") || name.length()<3)
            throw new InvalidNameException("Name should contain alphabet only - Please enter a valid Name");
        if(password.length()<8)
            throw new InvalidPasswordException("PLease enter a Strong Password");
        if(!mobileNumber.matches("[0-9]*") || mobileNumber.length()!=10)
            throw new InvalidMobileNumberException("PLease enter a valid Mobile Number");
    }
}
