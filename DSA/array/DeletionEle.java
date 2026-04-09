package DSA.array;

public class DeletionEle {
    public static void main(String[] args) {
        int arr []={10,20,30,40,50};
        int idx = 2;

        int newArr[]= new int[arr.length-1];
        int j=0;

        for (int i = 0; i<arr.length;i++){

            if(i==idx){
                continue;
            }
            newArr[j]=arr[i];
            j++;

        }
        for(int i : newArr){
            System.out.print(i+" ");
        }

    }
}
