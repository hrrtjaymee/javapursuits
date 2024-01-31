import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

public class Ch3_PrExercise1{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner inFile = new Scanner(new FileReader("C:\\Users\\User\\Documents\\Coding\\Java\\Skol\\ProgExercise1\\inData.txt"));
        PrintWriter outFile = new PrintWriter("C:\\Users\\User\\Documents\\Coding\\Java\\Skol\\ProgExercise1\\outData.txt");

        //pi value
        double pi = 3.1416;
        //first line == length and width of a rectangle
        double length = inFile.nextDouble();
        double width = inFile.nextDouble();
        //second line == radius of  circle
        double radius = inFile.nextDouble();
        //third line == name, last name, age
        String name = inFile.next();
        String lastName = inFile.next();
        int age = inFile.nextInt();
        //fourth line == savings account balance begin. of month, interest rate per year
        int accountBal = inFile.nextInt();
        double interestRate = inFile.nextDouble();
        double useInterestRate = interestRate / 100; 
        //fifth line == uppercase between A & Y
        String letter = inFile.next();

       //Calculating rectangles values
        double recArea = Math.round((length * width) * 100) / 100d;
        double recParameter = Math.round(2 * (length + width) * 100) / 100d;

       //Calculating circle values
        double circumference = Math.round((2 * pi * radius) * 100) / 100d;
        double circArea = Math.round(pi * ((radius * radius))) / 100d;

        //person values
        String fullName = name + " " + lastName;
        //0.083333 is 1/12 (to calculate the interest in months)
        double endAccountBal = Math.round((((useInterestRate * 0.083333) * accountBal) + accountBal) * 100)/100d;
        System.out.println(endAccountBal);
        System.out.println(useInterestRate);
        System.out.println(interestRate);
        //letter - get ascii value - take next letter - convert back to String
        char theLetter = letter.charAt(0);
        int asciival = (int) theLetter + 1;
        letter = String.valueOf(Character.toChars(asciival));

        //output new lines in output file
        String recOutput = "Rectangle: \nLength = " + length + ", width = " 
                                + width + ", area = " + recArea + ", parameter = "
                                + recParameter;
        String circOutput = "Circle: \nRadius = " + radius + ", area = " 
                                + circArea + ", circumference = " + circumference;
        String personOutput = "Name: " + fullName + ", age: " + age + "\nBeggining balance = $"
                                + accountBal + ", interest rate = " + interestRate + 
                                "\nBalance at the end of the month = $" + endAccountBal;
        String letterOutput = "The character that comes after A in the ASCII set is " + letter;

        outFile.println(recOutput);
        outFile.println(circOutput);
        outFile.println(personOutput);
        outFile.println(letterOutput);
            
        //close scanner and file
        inFile.close();
        outFile.close();


    }
}
