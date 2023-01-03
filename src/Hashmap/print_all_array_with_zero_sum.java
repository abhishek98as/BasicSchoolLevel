package Hashmap;
import java.util.HashMap;
import java.util.Map;
public class print_all_array_with_zero_sum {
        public static void main(String[] args) {
            int[] arr = {4, -1, 3, -2, -1,9,-4,-2,6,-4,5,-5};
            int[] result = findElementsWithSumZero(arr);
            if (result == null) {
                System.out.println("No Elements found");
            } else {
                System.out.println(result[0] + ", " + result[1]);
            }
        }

        public static int[] findElementsWithSumZero(int[] arr) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < arr.length; i++) {
                if (map.containsKey(arr[i])) {
                    return new int[] {map.get(arr[i]), arr[i]};
                }
                map.put(-arr[i], arr[i]);
            }
            return null;
        }
    }


