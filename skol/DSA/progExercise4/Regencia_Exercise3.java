import java.util.Scanner;

public class Regencia_Exercise3 {
    public static void main(String[] args){
        final int cookieBox = 24; //24 cookies
        final int boxCont = 75; //75 boxes
        int numBoxes; //inital number of boxes used with left over cookies
        int numContainers; //inital number of containers with left over boxes
        int leftCookies; //left over cookies
        int leftBox; //left over boxes
        int usedNumBox; //total number of shippable boxes
        int usedNumCont; //total number of shippable containers
        
        //taking user input
        Scanner userInput = new Scanner(System.in);
        System.out.print("number of cookies: ");
        int userCookies = userInput.nextInt();

        numBoxes = userCookies/cookieBox; 
        leftCookies = userCookies%cookieBox;
        numContainers = numBoxes / boxCont; 
        leftBox = numBoxes%boxCont;

        if ( numBoxes >= boxCont){ //calculation for number of used number of boxes nd containers
            usedNumBox = numBoxes - leftBox; 
            usedNumCont =  numContainers;
        }
        else{ //if number of cookies is less than required, there are no boxes and containers used
            usedNumBox = 0;
            usedNumCont = 0;
        }

        System.out.println("Used for shipping >>");
        System.out.println("Container: " + usedNumCont);
        System.out.println("Box: " + usedNumBox);
        System.out.println("Left Over >>");
        System.out.println("Box: " + leftBox);
        System.out.println("Cookie: " + leftCookies);

        userInput.close();
    }
}
