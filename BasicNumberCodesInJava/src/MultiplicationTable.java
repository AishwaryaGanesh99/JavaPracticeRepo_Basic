package BasicNumberCodesInJava.src;

import java.util.Scanner;

public class MultiplicationTable{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number greater than 1");
        int num = sc.nextInt();
        System.out.println("Enter the multiplier range");
        int range = sc.nextInt();

        MultiplicationTable mt = new MultiplicationTable();
        mt.table(num, range);

    }
    static void table(int num, int range){

        System.out.println("Multiplication table of "+num+ " from 1 to "+range);
      for(int i = 1; i <= range; i++){
          System.out.println(num+ " * " +i+ " = " +(num*i));
      }
    }
}