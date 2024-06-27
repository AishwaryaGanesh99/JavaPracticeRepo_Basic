package BasicDataStructureInJava.src;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch{


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        System.out.println("Enter the elements of the array");
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the key to be found");
        int key = sc.nextInt();

        BinarySearch bs = new BinarySearch();
        System.out.println(bs.binarySearch(arr, key));


    }

    private boolean binarySearch(int[] array, int key){

        Arrays.sort(array);
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if the key is present at mid
            if (array[mid] == key) {
                return true;
            }

            // If the key is greater, ignore the left half
            if (array[mid] < key) {
                left = mid + 1;
            }
            // If the key is smaller, ignore the right half
            else {
                right = mid - 1;
            }
        }

        // If we reach here, the element was not present
        return false;
    }

}
