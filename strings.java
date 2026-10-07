import java.util.*;
class strings {
    public static void main() {
        // stringbuilder to string
        StringBuilder sb = new StringBuilder("Hello");
        String str = sb.toString();
        System.out.println(str);

        // convert num to binary string
        int a1 = 5;
        String s = Integer.toBinaryString(a1);
        System.out.println(s);

        // convert binarystring to num
        String s2 = "101101";
        int a2 = Integer.parseInt(s2, 2);
        System.out.println(a2);

        // convert binary string to num using BigInteger
        String binary = "101101";
        BigInteger num = new BigInteger(binary, 2);
        System.out.println(num);

        // convert a string to its 8 bit ascii
        char ch = 'a';
        String bin = String.format("%8s", Integer.toBinaryString((int) ch)).replace(' ', '0');
        System.out.println(bin);

        // comparison of 2 strings lexicographically
        String b1="10001";
        String b2="11001";
        int result = b1.compareTo(b2);
        if (result < 0) {
            System.out.println(b1 + " is less than " + b2);
        } else if (result > 0) {
            System.out.println(b1 + " is greater than " + b2);
        } else {
            System.out.println(b1 + " is equal to " + b2);
        }

        // to split string into two parts based on a symbol
        // in the below example we are splitting the string into two parts based on the
        // symbol '+'
        String s3 = "1+3i";
        String[] p1 = s3.split("\\+");
        System.out.println(p1[1]);

        // splitting of sentence into words despite multiple spaces
        String sentence = "  Hello   World  ";
        String[] words = sentence.trim().split("\\s+");
        for (String word : words) {
            System.out.println(word);
        }

        // replacing of a char in a string
        int a = Integer.parseInt(p1[1].replace("i", ""));
        System.out.println(a);

        // substring method
        String string = "Hello World";
        String sub = string.substring(0, 5);
        System.out.println(sub);

        // sorting array of strings in lexicographical order
        String[] arr = { "banana", "apple", "cherry" };
        Arrays.sort(arr);
        for (String x : arr) {
            System.out.println(x);
        }

        // sort strings based on their length
        String[] arr2 = { "apple", "hi", "banana" };
        Arrays.sort(arr2, (c, d) -> c.length() - d.length());
        for (String y : arr2) {
            System.out.println(y);
        }

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
        for (char c : s5.toCharArray()) {
            System.out.println(c);
        }

        // check lowercase method
        char ch1 = s4.charAt(2);
        if (Character.isLowerCase(ch1)) {
            System.out.println("lowercase");
        }

        // character is letter or digit
        char ch2 = 'v';
        char ch3 = '0';
        System.out.println(Character.isLetter(ch2));
        System.out.println(Character.isDigit(ch3));

        // contains method
        String s6 = "abcde";
        String s7 = "bc";
        System.out.println(s6.contains(s7));
    }
}
