/*Write a program to find the sum and product of all elements of an array */

public class Five{
    public static void main(String[] args){
        int hatdog[] = {3, 4, 5, 7, 3, 34, 54};
        int counter = 0;
        for (int i: hatdog){
            counter += i;
        }

        System.out.println(counter);
    }
}
