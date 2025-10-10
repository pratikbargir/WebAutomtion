package PageObject_Code;

public class PalindromString {

    public static void main(String args[]){

        String str= "madam";
        String rev = new StringBuilder(str).reverse().toString();
        if(str.equals(rev))
        {
            System.out.println("Palindrom String");
        }
        else
        {
            System.out.println("Not a Palindrom String");
        }

    }
}
