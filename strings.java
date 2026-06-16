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

        // convert binary string to num using BigInteger
        String binary="101101";
        BigInteger num = new BigInteger(binary, 2);
        System.out.println(num);

        // to split string into two parts based on a symbol
            // in the below example we are splitting the string into two parts based on the symbol '+'
        String s3="1+3i";
        String[] p1=s3.split("\\+");
        System.out.println(p1[1]);

        // splitting of sentence into words despite multiple spaces
        String sentence = "  Hello   World  ";
        String[] words = sentence.trim().split("\\s+");
        for (String word : words) {
            System.out.println(word);
        }

        // replacing of a char in a string
        int a=Integer.parseInt(p1[1].replace("i",""));
        System.out.println(a);

        // substring method
        String str = "Hello World";
        String sub = str.substring(0, 5);
        System.out.println(sub);

        // sorting array of strings in lexicographical order
        String[] arr = {"banana", "apple", "cherry"};
        Arrays.sort(arr);
        
        // sort strings based on their length
        String[] arr = {"apple", "hi", "banana"};
        Arrays.sort(arr, (a, b) -> a.length() - b.length());

        // conversion of primitive datatypes to string
        int n = 123;
        String s1 = String.valueOf(n);
        System.out.println(s1);

        // trim and striptrailing methods
        String s4 = "   Hello World   ";
        System.out.println("'" + s4.trim() + "'");
        System.out.println("'" + s4.stripTrailing() + "'");

        // String to charArray 
        String s5 = "Hello";
        for(char c : s5.toCharArray()) {
            System.out.println(c);
        }

        // check lowercase method
        char ch=s4.charAt(2);
        if(Character.isLowerCase(ch)){
            System.out.println("lowercase");
        }
        
        
    }
}
