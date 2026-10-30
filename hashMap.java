import java.util.*;
public class hashMap {
    public static void main(String[] args){
        // declaration
        Map<Integer,Integer> map=new HashMap<>();

        // counting the frequency of elements in an array
        int[] arr={1,2,3,4,5,6,7,1,2,3,4,5,6,7,1,2,3,4,5,6,7};
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        System.out.println(map);

        // clearing the map
        map.clear();
    }
}
