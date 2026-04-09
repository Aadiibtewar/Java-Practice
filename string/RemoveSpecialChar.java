package string;

public class RemoveSpecialChar {
    public static void main(String[] args) {
        String inp = "$ja!$va&st%ar";

        String plainStr = inp.replaceAll("[^a-zA-Z0-9]", "");

        System.out.println(plainStr);
    }
}        