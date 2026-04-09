package DSA.array;

public class Sample {
    public static void main(String[] args) {
        int[] arr ;  //declaration 
        arr = new int[5]; // creation 
        arr[0]= 121;
        arr[1]=131;
        arr[2]=141;     // initialization 
        arr[3]=151;     // initialization 
        arr[4]=161;     // initialization
        
        // arr[5]=155; //Index 5 out of bounds for length 5

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]); // retriveing
        // System.out.println(arr[5]); // ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        // -----------------

        // for loop 

        for (int i =0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();


        // for each loop

        for (int i : arr) {
            System.out.print(i+" ");
        }

    }
}
