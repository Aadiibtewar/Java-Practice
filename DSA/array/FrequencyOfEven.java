package DSA.array;

public class FrequencyOfEven {
    public static void main(String[] args) {
       int ar[] = {1, 2, 8, 3, 4, 2, 6, 2, 2, 5, 1};
        
       int freq[] = new int[ar.length];

       int visited  = -1;

       for (int i = 0; i<ar.length;i++){
        if(ar[i]%2!= 0) continue;

        int count =1;
        for (int j = i+1; j<ar.length;j++){

            if(ar[i]==ar[j]){
                count++;
                freq[j] = visited;
            }
        }
        if(freq[i]!=visited) {
            freq[i]=count;}
       }

       for(int i = 0;i<ar.length;i++){
           if(freq[i]>0){
               System.out.println(ar[i]+" "+freq[i]);
           }
       }
       
    }
}
