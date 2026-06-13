public class basics {
    public static void main(String[] args) {
        // use of long literal
        long result = 2L * x;
        System.out.println(result);

        // ASCII value of character
        // A=65 to Z=90 & a=97 to z=122
        char ch = 'A';
        int asciiValue = (int) ch;
        System.out.println("ASCII value of " + ch + " is: " + asciiValue);               // ASCII value of A is: 65

        // num of an alphabet
        int num = 'c' - 'a';
        System.out.println(num);                                                         // 2

        // char to char conversion
        int num = 13;
        char ch=(char)('z'-num);
        System.out.println(ch);                                                          // m

        
    }
}