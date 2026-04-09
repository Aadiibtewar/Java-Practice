package DSA.array;

public class InsertEle {

    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};

        int idx = 2;
        int ele =100;

        int newArr[]= new int[arr.length+1]; 

        for (int i = 0; i<idx; i++){
            newArr[i]= arr[i];
        }

        newArr[idx]= ele;

        for(int i =  idx; i<arr.length;i++){
            newArr[i+1]= arr[i];    
        }
        for (int i : newArr) {
            System.out.print(i+" ");
        }
    }
}