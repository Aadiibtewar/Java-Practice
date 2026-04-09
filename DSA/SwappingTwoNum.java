package DSA;

public class SwappingTwoNum {
    public static void main(String[] args) {
        int a = 20; //1. assignment stmt
        int b = 30; //1.assignment stmt
        int temp = a; //1. assignment stmt
        a= b;   // 1. assignment stmt 
        b = temp;   //1.assignment stmt 

        System.out.println(a+" "+b ); // print stmt
    }
    // f(n) = 5 assignment stmt + 1 print stmt
    // f(n) = 6 unit time 
    // but we igonre constant so f(n)= 1 unit time
}
