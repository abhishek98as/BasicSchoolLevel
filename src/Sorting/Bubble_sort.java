package Sorting;
public class Bubble_sort {
    public static void main(String[] args) {
        int[] arr={7,8,3,1,2};
        int n=arr.length;
        int i, j, temp;
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        for(int k=0; k<arr.length; k++){
            System.out.print(arr[k]+" ");
        }
    }
}
