package variables_and_datatypes;

public class SwapWithoutVariable {
    public static void main(String[] args) {
        int num1 = 10 , num2=20;
        num1=num1+num2;//30
        num2 = num1-num2;//10
        num1 = num1-num2;//20

        System.out.println("after swap num1: "+num1 +" and num2 : "+num2);
        
    }
}
