
public class calculator{
    
    public static void Main(String[] args){

    };
    public  String calculator(String operator, int firstNum, int secNum) throws ArithmeticException{
        String newNum = "";
        int num;
        if (operator.equals(("+"))) {
            num = firstNum + secNum;
            
        }
        else if (operator.equals("-")) {
            num = firstNum - secNum;
        } 
        else if (operator.equals("*")) {
            num = firstNum * secNum;
        }
        else if (operator.equals("/")) {
            num = firstNum / secNum;
        }
        else{
        
        }
        return newNum;

    }
}
