package DSA;

public class StarPattern {
    public static void main(String[] args) {
        int n= 5;       // asgn stmt
        for(int i = 1;i<=n ;i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");      //n printing stmt
            }
            System.out.println(); // n printing stmt
        }
    }
}
/*
f(n) = 1 asgn + n * n printing stmt
f(n)= n^2 unit time 
*/
