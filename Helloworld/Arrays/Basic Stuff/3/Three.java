/*Take 20 integer inputs from user and print the following:
 * number of positive nums
 * number of negative nums
 * number of odd nums
 * number of even nums
 * number of Os
 */

 import java.util.Scanner;
public class Three {
    public static void main(String[] args){
        //user-num container
        int inputList[] = new int[20];

        //segregation bins :>

        int posNum = 0;
        int negNum = 0;
        int oddNum = 0;
        int evenNum = 0;
        int zeros = 0;


        //i miss input() func so much
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 20; i++){
            System.out.println("User input: ");
            inputList[i] = scanner.nextInt();
        }

        for (int i: inputList){
            if (i > 0){
                posNum += 1;
                if(i/2 ==0){
                    evenNum += 1;
                }
                else{
                    oddNum += 1;
                }
            }
            else if(i < 0){
                negNum += 2;
                if(i/2 == 0){
                    evenNum += 1;    
                }
                else{
                    oddNum += 1;
                }
            }
            else{
                zeros += 1;
            }
        }

        scanner.close();
        System.out.println("Positive numbers: " + posNum);
        System.out.println("Negative numbers: " + negNum);
        System.out.println("Even numbers: " + evenNum);
        System.out.println("Odd numbers: " + oddNum);
        System.out.println("Zeros: " + zeros);
    }
}
