import java.util.Arrays;

public class NumberToArray {
    public static void main(String[] args) {
        int number = -12345;  // Example negative number
        boolean isNegative = number < 0;
        
        number = Math.abs(number);  // Take the absolute value

        // Convert number to string
        String numStr = Integer.toString(number);

        // Create an array to hold the digits
        int[] digits = new int[numStr.length()];

        // Convert each character to an integer
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }

        for (int i = 0; i < numStr.length(); i++) {
            System.out.print(digits[i]);
        }
        
    }
}
