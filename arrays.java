import java.util.Arrays;
public class arrays {
    public static void main(String[] args) {
        // to return some array elements as an array
        //return new int[]{A[1],A[6]};

        // frequency of elements in an array
        int[] arr = {1, 2, 2, 3, 1, 4, 2};
        Arrays.sort(arr);
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            }
            else {
                System.out.println(arr[i - 1] + " -> " + count);
                count = 1;
            }
        }
        System.out.println(arr[arr.length - 1] + " -> " + count);

        // checks whether the elements of the array are equal
        //Arrays.equals(a1, a2)

        int[] arr = {5, 2, 8, 1};
        // ascending order
        Arrays.sort(arr, (a, b) -> a - b);
        // descending order
        Arrays.sort(arr, (a, b) -> b - a);

        // copying of an array into another array
        int[] ans = new int[nums.length*2];
        System.arraycopy(nums,0,ans,0,nums.length);
        System.arraycopy(nums,0,ans,nums.length,nums.length);
        return ans;
    }
}
