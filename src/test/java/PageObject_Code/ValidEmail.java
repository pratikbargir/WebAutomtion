package PageObject_Code;

public class ValidEmail {

    public static void main(String [] args){

        String email="pratik.bargir@gmail.com";
        String[]concat = email.split("@");
       System.out.println(concat[0]);
       System.out.println(concat[1]);

        if(email.contains("@gmail.com"))
        {
            System.out.println("Valid Email");
        }
        else
        {
            System.out.println("Invalid Email");
        }

        String name="Pr@tik";
        if(name.matches("^[a-zA-Z]*$]"))
        {
            System.out.println("Valid Name");
        }
        else
        {
            System.out.println("Invalid Name");
        }

        String number="7666385171";
        if(number.matches("//d{10}"))
        {
            System.out.println("Valid Number");
        }
        else
        {
            System.out.println("Invalid Number");
        }
    }
}
