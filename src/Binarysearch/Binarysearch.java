package Binarysearch;

public class Binarysearch {
    public static void main(String[] args) {
        System.out.println(search(new int[] {1,2,3,4,5,6,7,8,9,10},9));

    }
    public static int search ( int arr[], int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high-low) / 2;
            if (key == arr[mid]) {
                return mid;
            } else if (key > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;


            }
        }
        return -1;

    }}

