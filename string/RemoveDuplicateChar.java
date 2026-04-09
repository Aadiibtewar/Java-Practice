package string;



public class RemoveDuplicateChar {
    public static void main(String[] args) {
        String str= "programming";

        // approch 1 

        StringBuilder sb = new StringBuilder();

        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            int index = str.indexOf(ch, i+1);
            if (index == -1) {
                sb.append(ch);
          /* */
        }
    }
      // approch 2

        char [] chArr = str.toCharArray();

        StringBuilder sb1= new StringBuilder();

        for(int i = 0;i<chArr.length;i++){
            boolean repted = false;
            for (int j = i+1; j<chArr.length;j++){
                if (chArr[i]==chArr[j]) {
                    repted = true;
                    break;
                   
                }
            }
            if (!repted) {
                sb1.append(chArr[i]);
            }
        }
        System.out.println(sb1);

    }
}
