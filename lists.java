import java.util.*;
public class lists {
    public static void main(){
        // declaration of a list
        List<Integer> list = new ArrayList<>();

        // declaration of a list of lists
        List<List<Integer>> result = new ArrayList<>();  
        
        // pushing an array into a list
        int[] arr = {1, 2, 3, 4, 5};
        for (int num : arr) {
            list.add(num);   // manually add
        }


        // accessing elements of a list of lists based on pascal triangle approach
        int i=5;
        List<Integer> row=new ArrayList<>();
        for (int j = 0; j <= i; j++) {
            if (j == 0 || j == i) {
                row.add(1);
            }
            else {
                row.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
            }
        }


        // finding the first and second minimum element in a list
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int num : list) {
            if (num < min) {
                secondMin = min;
                min = num;
            } else if (num > min && num < secondMin) {
                secondMin = num;
            }
        }


        // finding the first and second maximum element in a list
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int num : list) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num < max && num > secondMax) {
                secondMax = num;
            }
        }


        // sorting of a list
        Collections.sort(list);

        // reverse sorting of a lists
        Collections.sort(list, Collections.reverseOrder());
    }
}
