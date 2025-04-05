public class Calculator {

 public static String operator = "ADD";

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        if(num1 > num2){
            throw new IllegalArgumentException("num1 is greater than num2");
        }
        return num1 - num2;
    }


}
