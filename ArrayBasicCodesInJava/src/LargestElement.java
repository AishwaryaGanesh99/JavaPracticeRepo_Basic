import java.util.Scanner;

public class LargestElement{

    public void findLargest(int arr[], int n){

        if(n==1){
            System.out.println(arr[0]);
        }
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }

        System.out.println("The largest element in the given array is " +max);

    }

    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        int array[] = new int[size];

        System.out.println("Enter " +size+ " elements of the array");
        for(int i = 0; i < size; i++){
            if(sc.hasNext()){
                array[i] = sc.nextInt();
            }
        }

        System.out.println("The entered array elements are :");
        for(int j = 0; j < array.length; j++){
            System.out.println(array[j]);
        }

        LargestElement le = new LargestElement();

        le.findLargest(array,size);

    }

}