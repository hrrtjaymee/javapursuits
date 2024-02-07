import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        int firstNum;
        int secondNum;
        String oddNums = "";
        String allNums = "";
        String squares = "";
        int evenSum = 0;
        int sumOddSquares = 0;
        
        System.out.println("Enter first number: ");
        firstNum = userInput.nextInt();

        System.out.println("Enter second number: ");
        secondNum = userInput.nextInt();

        //firstNum must be less than secondNum
        if(firstNum < secondNum){
            int i = firstNum;
            while(i <= secondNum){
                if(i%2 != 0){ //collect odd numbers
                    oddNums = oddNums + " " + i;
                    sumOddSquares += Math.pow(i, 2);
                }
                else{ //collect even numbers
                    evenSum += i;
                }
                allNums = allNums + " " + i;
                squares = squares + " " + (int) Math.pow(i, 2);
                i++;
            }

            System.out.println("Odd numbers: " + oddNums);
            System.out.println("Sum of even numbers: " + evenSum);
            System.out.println("Numbers: " + allNums);
            System.out.println("Squares of the numberss: " + squares);
            System.out.println("Squares of the odd numbers: " + sumOddSquares);
        }
        else{
            System.out.println("First number must be less than the second number.");
        }
    }
}
