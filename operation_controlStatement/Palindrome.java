package operation_controlStatement;

public class Palindrome {
    public static void main(String[] args) {
        int num = 1221;
        int rev = 0;
        int temp = num;
        while (temp!=0){
            rev = rev*10+temp%10;
            temp/=10;
        }
        System.out.println(num==rev?"the given number is palindrome number":"the given number is not palindrome number");
    }
}
