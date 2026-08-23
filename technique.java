public class technique {
    //combination nCk
    static long nCk(int n, int k) {
        if (k < 0 || k > n) return 0;

        long res = 1;
        for (int i = 1; i <= k; i++) {
            res = res * (n - i + 1) / i;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(nCk(5, 2)); // Output: 10    
    }
}
