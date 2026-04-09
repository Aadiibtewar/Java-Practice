package variables_and_datatypes;

import java.util.Scanner;

public class SimpleAndCompoundInterest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int p = 0;// principle amount
        double r = 0;// rate of interest
        byte t = 0;// time in year
        byte opt = 0;

        System.out.println("principle amount : ");

        if (!scanner.hasNextInt()) {
            System.out.println("Enter valid amount");
            return;
        }
        p = scanner.nextInt();

        System.out.println("rate of Interest : ");

        if (!scanner.hasNextDouble()) {
            System.out.println("Enter valid rate of Interest");
            return;
        }
        r = scanner.nextDouble();

        System.out.println("Number of Year : ");

        if (!scanner.hasNextByte()) {
            System.out.println("Enter valid number of years");
            return;
        }

        t = scanner.nextByte();

        System.out.println("choose the options:\n1 : Simple interest\n2 : Coumpound Interest");
        if (!scanner.hasNextByte()) {
            System.out.println("Enter valid option (1 or 2)");
            return;
        }
        opt = scanner.nextByte();

        if (opt == 1) {

            System.out.println("you choose for Simple Interest....");

            System.out.println("Simple interest : " + sI(p, r, t));
        }

        else if (opt == 2) {
            System.out.println("you choose for Compound Interest....");

            System.out.println("compound interest : " + cI(p, r, t));
        } else {
            System.out.println("Enter valid option");
        }
        scanner.close();
    }

    private static double cI(int p, double r, byte t) {
        double amount = p * (Math.pow((1 + (r / 100)), t));
        return amount - p;
    }

    private static double sI(int p, double r, byte t) {
        return (p * r * t) / 100.0;
    }

}
