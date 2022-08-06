package Searching;

public class BINARY_TRIAL {
    public static void binarySearch(int arr[], int f, int l, int key){
        int mid = (f + l)/2;
        while( f <= l){
            if ( arr[mid] < key ){
                f = mid + 1;
            }else if ( arr[mid] == key ){
                System.out.println("Element is found at index: " + mid);
                break;
            }else{
                l = mid - 1;
            }
            mid = (f + l)/2;
        }
        if ( f > l ){
            System.out.println("Element is not found!");
        }
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int key = 6;
        int last=arr.length-1;
        binarySearch(arr,0,last,key);
    }
}
