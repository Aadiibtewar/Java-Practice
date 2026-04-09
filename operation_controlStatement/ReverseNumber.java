package operation_controlStatement;

import java.util.Scanner;

public class ReverseNumber {//4561
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number ...");

        if (!scanner.hasNextInt()){
            System.out.println("enter valid number!!");
            return;
        }
        int num = scanner.nextInt();
        
        int rev = 0;
        while (num!=0){
            rev = rev*10+num%10;
            num/=10;
        }
        System.out.println("reverse number is : "+rev);
        scanner.close();
    }
}
