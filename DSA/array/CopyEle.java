package DSA.array;

public class CopyEle {
    public static void main(String[] args) {
        int ar[]= {10,20,39,40,50,51,47};

        // for (int i : copyAr(ar)) {
        //     System.out.print(i+" ");
        // }

        for (int i : copyEven(ar)) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i : copyOdd(ar)) {
            System.out.print(i+" ");
        }


    }

    private static int[] copyAr (int ar [])
    {
        int []newAr= new int[ar.length];
        for(int i = 0 ; i<ar.length;i++){
            newAr[i]=ar[i];

        } 
        return newAr;
    }

    private static int [] copyEven(int ar[]){
        int idx = 0;
        for(int i : ar){
            if (i%2 ==0){
                idx++;
            }
        }

        int arEven[] = new int[idx];
        int j = 0;
        for(int i = 0 ;i<ar.length;i++){
            if(ar[i]%2==0){
                arEven[j]=ar[i];
                j++;
            }
        }
        return arEven;
    }

    private static int[] copyOdd(int ar[]){
        int idx= 0;
        for (int i : ar) {
            if(i%2!=0){
                idx++;
            }
        }

        int arOdd[] = new int[idx];
        int j = 0;
        for(int i =  0; i<ar.length;i++){
            if(ar[i]%2!=0){
                arOdd[j]=ar[i];
                j++;
            }
        }
        return arOdd;
    }
}
