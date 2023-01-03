package School_Level;
import java.util.Arrays;

public class findElementsWithSumZero {
        public static void main(String[] args) {
            int[] arr = {-4, 1, 3, -2, -1};
            int[] result = findElementsWithSumZero(arr);
            if (result == null) {
                System.out.println("No Elements found");
            } else {
                System.out.println(Arrays.toString(result));
            }
        }

        public static int[] findElementsWithSumZero(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[i] + arr[j] == 0) {
                        return new int[] {arr[i], arr[j]};
                    }
                }
            }
            return null;
        }
    }


