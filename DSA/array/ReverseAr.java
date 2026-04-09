package DSA.array;

public class ReverseAr {
    public static void main(String[] args) {
        int []ar = {10,20,30,40,50};
        // printRev(ar);

        // for (int i : copyRev(ar)) {
        //     System.out.print(i+" ");
        // }

        for(int i : revSameAr(ar)){
            System.out.print(i+" " );
        }
    }
    private static void printRev(int ar[]){
        for (int i =ar.length-1;i>=0;i--){
            System.out.print(ar[i]+" ");
        }
    }

    // create new arary and in copy Reverse
    private static int[]  copyRev(int ar[])
    {
        int newAr[] = new int[ar.length];
        for(int i =0; i<ar.length;i++){
            newAr[ar.length-i-1]=ar[i];
        }
        return newAr;
    }

    private static int [] revSameAr(int ar[]){
        for(int i =0;i<ar.length/2;i++){
            int temp = ar[ar.length-i-1];
            ar[ar.length-i-1]=ar[i];
            ar[i]=temp;
        }
        return ar;
    }
}
