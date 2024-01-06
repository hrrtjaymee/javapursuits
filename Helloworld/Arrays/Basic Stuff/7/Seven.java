/*Find the largest and smallest elements of an array. */

public class Seven {
    public static void  main(String[] args){
        
        int theList[] = {2, 65, 89, 56, 3, 98, 67, 34};
        
        int largestNumCounter = theList[0];
        int smallestNumCounter = theList[0];

        for (int i: theList){
            if (largestNumCounter <= i){ //for largest number
                largestNumCounter = i;
            }

            if (smallestNumCounter >= i){//for smallest number
                smallestNumCounter = i;
            }
        }

        System.out.println(String.format("The smallest number is %d", smallestNumCounter));
        System.out.println(String.format("The largest number is %d", largestNumCounter));
    }
}
