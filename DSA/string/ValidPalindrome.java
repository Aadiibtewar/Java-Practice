package DSA.string;

public class ValidPalindrome {
    public static void main(String[] args) {
        // String s = "A man, a plan, a canal : Panama";   //true
        // String s = "race a car";        //false
        String s = "   ";
        System.out.println(isValidPalindrome(s));
       
    }

    private static boolean isValidPalindrome(String s){
         int start =0, end = s.length()-1;

        while(start<end)
        {
            while (start<end && !Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }

            while (start<end && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }

            char startChar = s.charAt(start), endChar = s.charAt(end);

            if (Character.toLowerCase(startChar)!=Character.toLowerCase(endChar))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
