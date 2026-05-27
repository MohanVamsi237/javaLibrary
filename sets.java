import java.util.HashSet;
import java.util.Set;
public class sets { 
    public static void main(String[] args) {
        // pushing an array into a set
        int[] arr = {1, 2, 3, 2, 4};
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        System.out.println(set);

        // returns the size of the set
        set.size();

        // removes an element
        set.remove(10);

        // checks whether the element exists in set or not
        set.contains(20);

        // checks whether the set is empty or not
        set.isEmpty();

    }  
}
