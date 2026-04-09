package DSA.array;

// Sum of all element in an array.

public class SumOfArr {
    public static void main(String[] args) {
        int ar[] = {10,21,30,40,50};
        int sum = 0;
        for (int i: ar){
            sum+=i;
        }
        System.out.println("The sum of all element is "+sum);
        System.out.println("The sum of all Even element is "+evenSum(ar));
        System.out.println("The sum of all Odd element is "+oddSum(ar));

    }


    private static int oddSum(int[] ar) {
        int sum =0;
        for (int i : ar) {
            if(i%2!=0){
                sum+=i;
            }
        }
        return sum;
    }


    private static int evenSum(int ar[])
    {
        int sum =0;
        for(int i : ar)
        {
            if(i%2==0){
                sum+=i;
            }
        }
        return sum;
    } 
}
