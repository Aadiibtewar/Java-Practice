package DSA.array;

public class CountFrequency 
{

    public static void main(String[] args)
    {
        int ar[] = {1,6,4,5,14,5,45,1,42,24,5412,15};

        int freq[] = new int[ar.length];
        
        int visited = -1;

        for(int i= 0; i<ar.length;i++)      // traverse all elements
        { 
            int count = 1;
            for(int j = i+1;j<ar.length;j++)        // compare i to alll elements
            {
                
                if(ar[i]==ar[j])
                {
                    count++;
                    freq[j] = visited;
                }
            }
            if(freq[i]!=visited){
                freq[i]=count;
            }
        }

        // display frequency
        
        System.out.println("elements |   frequency");
        for(int i = 0; i<ar.length;i++){
            if(freq[i]!=visited){
                System.out.println(ar[i]+"       |    "+freq[i]);
            }
        }

    }
    
}