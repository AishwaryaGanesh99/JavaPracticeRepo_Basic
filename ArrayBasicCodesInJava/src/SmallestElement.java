import java.util.Scanner;

public class SmallestElement {

    public static void findSmallest(int[] array, int size){

        int min = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }

        System.out.println("The smallest element in the given array is " +min);
    }

    public static void main(String[] args) {

        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i = 0; i < n; i++){
            if (sc.hasNext()) {
                arr[i] = sc.nextInt();
            }
        }

        SmallestElement se = new SmallestElement();
        se.findSmallest(arr, n);


    }
}

