package PageObject_Code;

import org.openqa.selenium.remote.tracing.opentelemetry.SeleniumSpanExporter;

public class StringCaps {

    public static void main(String[] args) {
        String str= "RohAN KamBle";
        int count_uppercase = 0;
        int count_lowercase = 0;
        StringBuilder result = new StringBuilder();
        for(char S: str.toCharArray()){
            if(Character.isUpperCase(S))
            {
                result.append(Character.toLowerCase(S));
                count_lowercase ++;
            }
            else if(Character.isLowerCase(S)){
                result.append(Character.toUpperCase(S));
                count_uppercase ++;
            }
            else{
                result.append(S);
            }
        }

        System.out.println("Actual String: "+" "+str);
        System.out.println("After String builder operation: "+ " " +result.toString());
        System.out.println("Count of Uppercase letters: "+ " "+count_uppercase);
        System.out.println("Count of Lowercase letters: "+ " "+count_lowercase);
    }
}
