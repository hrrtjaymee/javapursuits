/*Take 10 integer inputs from user and store them in an array
 * Again ask user to give a number. Tell the user whether that 
 * number is present in an array or not
 * copy paste code from 1 lskasjdlas
 */
import java.util.Scanner;

public class Two {
    public static void main(String[] args){
        int inputList[] = new int[10];
        Scanner scanner = new Scanner(System.in); //unsay pulos anang system.in oys
        
        for (int i = 0; i < inputList.length; i++){
            System.out.println("User input: ");
            inputList[i] = scanner.nextInt();
        }
        
    
        // scanner.close();
        // ask user for new number
        Scanner newScanner = new Scanner(System.in);
        System.out.print("Enter number: " );
        int userInput = newScanner.nextInt();


        int counter = 0;
        for (int i : inputList){
            if (userInput == i){
                counter += i;
            }
        }

        System.out.println(counter + " is in the list.");
        
        scanner.close();
        newScanner.close();
    }
}

    
