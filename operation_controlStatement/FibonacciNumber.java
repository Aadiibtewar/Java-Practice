package operation_controlStatement;

public class FibonacciNumber {
    public static void main(String[] args) {
        int a =0,b=1,res=0;
        for (int i =0;i<8;i++){
            System.out.println(a);
            res = a+b;
            a = b; b=res;
        }

    }
}
