import java.util.*;
class Leetcode{
    public static void main(){
        // convert num to binary string
        int a1=5;
        String s=Integer.toBinaryString(a1);
        System.out.println(s);

        //convert binarystring to num
        String s2="101101";
        int a2=Integer.parseInt(s2,2);
        System.out.println(a2);

        // to split string into two parts based on a symbol
        String s3="1+3i";
        String[] p1=s3.split("\\+");
        System.out.println(p1[1]);

        // replacing of a char in a string
        int a=Integer.parseInt(p1[1].replace("i",""));
        System.out.println(a);

        // convert binary string to num using BigInteger
        String binary="101101";
        BigInteger num = new BigInteger(binary, 2);
        System.out.println(num);

        // sort strings based on their length
        String[] arr = {"apple", "hi", "banana"};
        Arrays.sort(arr, (a, b) -> a.length() - b.length());

        // conversion of primitive datatypes to string
        int n = 123;
        String s1 = String.valueOf(n);
        System.out.println(s1);
    }
}
