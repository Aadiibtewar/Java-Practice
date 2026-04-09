package DSA;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;  // assi stmt
        int fact = 1;   // assi stmt
        for(int i= 1 ; i<=n;i++) // loop
        {
            fact = fact*i;  // looping stmt
        }
        System.out.println("factorial of "+n+" is "+ fact); // printing stmt
    }
    // f(n)= 2 assi stmt + 1 printing stmt+ n looping stmt
    // 3+n but we ignore constant 
    // f(n)=n unit of time
}
