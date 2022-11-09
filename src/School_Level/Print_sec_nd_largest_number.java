package School_Level;

public class Print_sec_nd_largest_number {
    public static void main(String[] args) {


        int[] arr = {50, 50, 50, 50, 50, 50, 50, 50};
        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;

        for (
                int i = 0;
                i < arr.length; i++) {
            if (arr[i] > max) {
                secondmax = max;
                max = arr[i];
            } else if (arr[i] < max && arr[i] > secondmax) {
                secondmax = arr[i];
            }
        }
        if (secondmax > Integer.MIN_VALUE) {
            System.out.println( secondmax);
        } else {
            System.out.println("not found");
        }
    }
}

