package edabit;

public class ManyOperators {
   public static int operation(int num1, int num2, String operator){
       if(num2==0 && operator.equals("%")){
           System.out.println("No devision by 0");
       }
       if (operator.equals("%")){
           return num1%num2;
       }if(operator.equals("+")){
           return num1+num2;
       }else
           return num1-num2;

    }

    public static void main(String[] args) {
        System.out.println(operation(29, 87,"+"));
        System.out.println(operation(2,0, "%"));

    }
}
