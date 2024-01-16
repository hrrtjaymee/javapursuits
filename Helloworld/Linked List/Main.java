import java.util.LinkedList;

public class Main {
  public static void main(String[] args){
    LinkedList<Float> real = new LinkedList<>();
    real.add(1, (float)3.14);
    System.out.println(real);
    for (Float str: real){
      System.out.println(str);}
  }
}
