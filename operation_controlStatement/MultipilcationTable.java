package operation_controlStatement;

import java.util.Scanner;

public class MultipilcationTable {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("enter number for table");
        if(!scanner.hasNextInt()){
            System.out.println("Enter a Integer number");
            return;
        }
        int num = scanner.nextInt();
         for(int i =1;i<=10;i++){
            System.out.println(num+" * "+i+" = "+num*i);
         }
    }
}
