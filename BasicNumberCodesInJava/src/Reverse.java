package BasicNumberCodesInJava.src;

import java.util.Scanner;

public class Reverse{
     public void reverseNum(int num){

         int i = num;
         while(i > 0){
             System.out.print(" "+i);
             i--;
         }


//         for(int i = num; i > 0; i--){
//          System.out.print(i + " ");
//         }

     }

     public static void main (String[] args){

         Scanner sc  = new Scanner(System.in);
         System.out.println("Enter a number");
         int n = sc.nextInt();

         Reverse a = new Reverse();
         a.reverseNum(n);

     }

}