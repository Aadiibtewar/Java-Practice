package DSA.array;

public class FrequencyOfTheNum {
    public static void main(String[] args) {
        int ar[] = {1, 2, 8, 3, 2, 2, 2, 5, 1};

        int num = 0;

        int count = 0;

        for(int i : ar){
            if (i==num){
                count++;
            }
        }
        if(count>0){
            System.out.println("the frequncy of " +num+" is "+count);
        }
        else{
            System.out.println("element not found!");
        }
    }
}
