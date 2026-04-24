package DSA.array;

public class TwoSum {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,7,9};

        int target = 10;

        boolean found = false;

        int left=0 , right = arr.length-1;

        while (left<right) {
            int sum = arr[left]+arr[right];

            if (sum== target) {
                System.out.println("indices of the pair are: "+left+", "+right);

                found = true;
                break;
            }

            else if(sum>target){
                right--;
            }
            else{
                left++;
            }

        }
        if(!found) System.out.println("pair not found");
    }
}
