/* Take 10 integer inputs from user and store them in an array
and print them on screen
 */
import java.util.Scanner;
public class One {
    public static void main(String[] args){
        int inputList[] = new int[10];
        Scanner scanner = new Scanner(System.in); //unsay pulos anang system.in oys
        
        for (int i = 0; i < inputList.length; i++){
            System.out.println("User input: ");
            inputList[i] = scanner.nextInt();
        }
        
    
        scanner.close();

        System.out.print("The user values are: ");
        for (int i = 0; i < inputList.length; i++){
            System.out.print(inputList[i] + ", ");
        }
        System.out.print(".");
    }
}
