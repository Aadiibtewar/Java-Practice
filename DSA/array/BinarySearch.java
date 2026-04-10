package DSA.array;

public class BinarySearch {
    public static void main(String[] args) {

        int ar[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int num =10;
        int low = 0;
        int high = ar.length;

        while (low<high) {
            int mid = (low+high)/2;
            if (ar[mid]==num) {
                System.out.println("element found at "+mid+" position");
                return;
            }

            if(num<ar[mid]){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        System.out.println("element not found!");


    }
}
