import java.util.Scanner;

public class LinearSearch{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        System.out.println("Enter " +size+ " elements for the array");
        int arr[] = new int[size];
        for(int i = 0; i < arr.length; i++ ){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the key to be searched");
        int key = sc.nextInt();

        LinearSearch srch = new LinearSearch();
        srch.linear(arr, key);

    }
    public void linear(int[] array, int key){

        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == key ) {
                System.out.println("The given key " + key + " is stored as element " + (i + 1) + " in the array");
                count += 1;
            }
        }

        if(count == 0){
            System.out.println("The given key " +key+ " is not found in the array");
        }
    }
}