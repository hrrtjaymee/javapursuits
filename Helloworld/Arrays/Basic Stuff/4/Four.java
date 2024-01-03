/*Take 10 integer inputs from user and store them in an array.
 * Now, copy all the elements in another array but in reverse order.
 */
import java.util.Scanner;
import java.util.Arrays;

public class Four {
    public static void main(String[] args){
        //num containers
        int inputList[] = new int[10];
        int reverseList[] = new int[10];

        //initialize scanner
        Scanner scanner = new Scanner(System.in);

        //getting user input
        for (int i = 0; i < 10; i++ ){
            System.out.println("Enter number: ");
            inputList[i] = scanner.nextInt();
        }

        scanner.close();

        //reversing inputList
        int counter = 0;
        for (int i = inputList.length - 1; i >= 0;  i--){
            reverseList[counter] = inputList[i];
            counter++;
        }

        System.out.println(Arrays.toString(inputList));
        System.out.println(Arrays.toString(reverseList));
    }
}
