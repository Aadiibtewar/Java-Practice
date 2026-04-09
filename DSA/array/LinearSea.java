package DSA.array;

public class LinearSea {
    public static void main(String[] args) {
        int []arr = {10,20,30,40,50};
        int ele   = 200;
        boolean found= false;
        for (int i= 0;i<arr.length;i++)
        {
            if(arr[i]==ele)
            {
                System.out.println("element found at : "+i+" position");
                found=true;
                break;

            }
        }
        if(!found) System.out.println("Element not found!");
    }
}
