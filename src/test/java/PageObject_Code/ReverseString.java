package PageObject_Code;

public class ReverseString {

    public static void main(String[] args){

        String str= "Selenium";
        String rev= new StringBuilder(str).reverse().toString();
        System.out.println("Actual String:"+" "+ str);
        System.out.println("Reversed String:"+" "+ rev);

    }
}
