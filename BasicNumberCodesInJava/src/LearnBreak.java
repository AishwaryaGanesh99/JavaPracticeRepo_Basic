package BasicNumberCodesInJava.src;

import java.util.Scanner;

/*
*
* Write a program to print all numbers between two intervals, namely low and high.
*  But with a special condition that if any number in the range while getting printed
* becomes divisible by 13, then do not print anything further and end the program.
*
* */
public class LearnBreak {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the lower range");
        int num1 = sc.nextInt();
        System.out.println("Enter the higher range");
        int num2 = sc.nextInt();

        LearnBreak br = new LearnBreak();
        br.printAll(num1,num2);

    }

    public static void printAll(int low, int high){
            int i = low;
            while(i <= high){
                System.out.print(i +" ");

                if(i % 13 == 0){
                    break;
            } i++;
        }
    }
}
