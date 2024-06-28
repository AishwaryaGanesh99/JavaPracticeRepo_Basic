import java.util.Scanner;

public class ArraySort{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        System.out.println("Enter the elements of the array to be sorted");
        int[] arr = new int[size];

        for(int i = 0; i <arr.length; i++){
            arr[i] = sc.nextInt();
        }

        ArraySort srt = new ArraySort();
        srt.sort(arr);

    }

    public void sort(int[] array){
        int temp = 0;
         for(int i=0; i < array.length; i++){
             for(int j = i+1; j < array.length; j++){
                 if(array[i] > array[j]){
                     temp = array[i];
                     array[i] = array[j];
                     array[j] = temp;
                 }
             }
         }

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i] + " ");
        }
    }

}