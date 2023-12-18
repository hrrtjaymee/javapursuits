import java.util.Scanner;

public class Palindrome  {
    public static void  main(String[] args){ //static --> shared by all instances of the class
        String palWord;
        palWord = "";
        String counter;

        System.out.print("Enter word: ");
        Scanner scanner = new Scanner(System.in);
        String userWord = scanner.nextLine();
        scanner.close();
        // System.out.println(userWord);

        char letterList[];
        letterList = new char[userWord.length()];
        letterList = userWord.toCharArray();

        //reversing userWord
        for(char ch : letterList){ 
            counter = palWord;
            palWord = ch + counter;
        }

        //checking for palindrome "quality"
        if (userWord.equals(palWord)){ //why doesnt == work ;-;
            System.out.println(userWord + " is a palindrome.");
        }
        else {
            System.out.println(userWord + " is not a palindrome.");
        }
        
    }
    
}
