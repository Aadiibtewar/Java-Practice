package string;

public class ReverseString {
    public static void main(String[] args) {
        String str = "hello";


        // approch 1
        char[] chArr = str.toCharArray();
        
        for(int i = chArr.length-1;i>=0;i--){
            System.out.print(chArr[i]);
        }

        System.out.println();
        // approch 2

        for(int i= str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
        //approch 3
        System.out.println(); 


        StringBuffer sb = new StringBuffer(str);
        System.out.print(sb.reverse());

        // approch 4
        System.out.println();
        
        StringBuilder sbr = new StringBuilder(str);
        System.out.print(sbr.reverse());

    }
}
