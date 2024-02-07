import java.util.Scanner;

public class Ch5_PrExercise1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking user input
        System.out.println("Input a number: ");
        int input = sc.nextInt();

        int sum = 0;
        String digits = "";

        while (input > 0) {
            int digit = input % 10; //take the last digit of the umber
            sum += digit; // adding to sum of digits
            digits = digit + " " + digits; //storing last digit
            input /= 10; //shortening the number
        }

        System.out.println("Individual digits: " + digits);
        System.out.println("Sum of digits: " + sum);

        sc.close();
    }
}
