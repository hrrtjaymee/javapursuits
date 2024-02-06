import java.util.Scanner;


public class Ch5_PrExercise1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");

        String inputUser = sc.next();
        int length = inputUser.length();
        int sum = 0;
        
        for (int i = 0; i < length; i++){
            char ch = inputUser.charAt(i);
            System.out.print(ch + " ");
        }
        System.out.println();

        for(int i = 0; i < length; i++){
            int num = (int) inputUser.charAt(i);
            sum += num;
        }
        System.out.println(sum);
        sc.close();
    }
}
