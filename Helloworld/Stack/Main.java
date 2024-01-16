import java.util.Stack;

public class Main{
  public static void main(String[] args){
    Stack<String> surreal = new Stack<>();
    surreal.push("harriet");
    surreal.push("Aint now way");
    surreal.push("haryet");

    surreal.pop();

    System.out.println(surreal);
    System.out.println(surreal.firstElement());
    System.out.println(surreal.lastElement());
  }
}
