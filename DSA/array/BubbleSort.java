package DSA.array;

public class BubbleSort {
    public static void main(String[] args) {
        int ar[]={12,21,45,21,2,4,577,84,1};

        int temp;

        for(int i = 1; i<ar.length;i++) // number of passes
        {
            boolean swapped = false; // 
            for(int j =0; j<ar.length-i;j++)  // for traverse the array
            {
                if (ar[j]>ar[j+1]) {    // compare the adjacent element and swap the numbers 
                    temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                    swapped = true;  // if elements swapped it becomes true 

                }
            }
            if(!swapped){   // if swapped is false it means array is sorted and loop will break;
                break;
            }
        }
        for (int i:ar){
            System.out.print(i+" ");
        }
    }
}
