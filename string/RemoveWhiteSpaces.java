package string;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String str = "ja v a pr ogra mi ng .";
        String txt = str.replaceAll(" ", "");
        System.out.println(txt);
    }
}
