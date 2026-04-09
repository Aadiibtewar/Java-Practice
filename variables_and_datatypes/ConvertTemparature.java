//Convert temperature (Celsius ↔ Fahrenheit).

package variables_and_datatypes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConvertTemparature {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte opt = 0;
        
        System.out.println("--------Choose your option---------\n1 : Fahrenheit to Celsius\n2 : Celcius to Farhenheit");
        
        if (!scanner.hasNextByte()){
            System.out.println("Enter valid choice (0 or 1)");
            return;
        }            
        opt = scanner.nextByte();
        
        if (opt == 1){
            System.out.println("running Fahrenheit to Celsius");
            System.out.println("Enter Temp in Farhenheit");

            if (!scanner.hasNextDouble()){
                System.out.println("enter valid temparature ");
                return;
            }
            double temp = scanner.nextDouble();
            double res =
                (temp-32)*(5.0/9.0);
            
            System.out.println("Temp in Celcius is "+ res +"C");

        }
        else if (opt == 2) {
            System.out.println("running Celcius to Farhenheit ");
            System.out.println(" Enter Temp in Celcius");
              if (!scanner.hasNextDouble()){
                System.out.println("enter valid temparature ");
                return;
            }
            double temp = scanner.nextDouble();
            double res = temp*(9.0/5.0) + 32;
            System.out.println("Temp in Fahrenheit is "+res+" F");

        } else {
            System.out.println("enter valid option(1 or 2)");
        }
        scanner.close();
    }
    
   
}
