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

        
    }
}
