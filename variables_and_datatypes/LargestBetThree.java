package variables_and_datatypes;
public class LargestBetThree {
    public static void main(String[] args) {
        int num1=45,num2=44,num3=120;
        int lar = (num1>num2?num1:num2)>num3?((num1>num2)?num1:num2):num3;
        System.out.println(lar);
    }
}
