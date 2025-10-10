package PageObject_Code;

public class Demo2 {

    public void count(String Str, int UpperCase, int LowerCase) {
        for (char ch : Str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                UpperCase++;
            } else if (Character.isLowerCase(ch)) {
                LowerCase++;
            } else {
                // Ignore non-alphabetic characters
            }

        }
        System.out.println("UpperCase Count: " + UpperCase);
        System.out.println("LowerCase Count: " + LowerCase);
    }

    public void convert(String Str, StringBuilder result)
    {

        for (char ch : Str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(ch); // Non-alphabetic characters remain unchanged
            }
        }

        System.out.println("Converted String: " + result.toString());
    }
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        int UpperCase = 0;
        int LowerCase = 0;
        String Str ="PrAtIK BarGIr";

        Demo2 d =new Demo2();
        d.convert(Str,result);
        d.count(Str,UpperCase,LowerCase);

    }
    }
