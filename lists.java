import java.util.*;
public class lists {
    public static void main(){
        // declaration of a list of lists
        List<List<Integer>> result = new ArrayList<>();       

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


    }
}
