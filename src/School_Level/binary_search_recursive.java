package School_Level;

public class binary_search_recursive {
        int rec_bin_search(int arr[], int l, int r, int x){
            if (r >= l){
                int mid = l + (r - l) / 2;
                if (arr[mid] == x)
                    return mid;
                if (arr[mid] > x)
                    return rec_bin_search(arr, l, mid - 1, x);
                return rec_bin_search(arr, mid + 1, r, x);
            }
            return -1;
        }
        public static void main(String args[]){
            binary_search_recursive my_object = new binary_search_recursive();
            int my_arr[] = { 56};
            int l = my_arr.length;
            int x = 56;
            int result = my_object.rec_bin_search(my_arr, 0, l - 1, x);
            if (result == -1)
                System.out.println("not present");
            else
                System.out.println(result);
        }
    }

