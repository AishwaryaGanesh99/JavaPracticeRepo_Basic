package BasicNumberCodesInJava.src;

/*
Write a program to print all numbers between two intervals, namely low and high.
But, with a special condition that numbers divisible by 5 must not be printed and skipped.
 */

import java.util.Scanner;

public class LearnCont {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower range");
        int low = sc.nextInt();
        System.out.println("Enter the higher range");
        int high = sc.nextInt();

        LearnCont ct = new LearnCont();
        ct.cont(high,low);

    }

    static void cont(int high, int low){
        for(int i = low; i <= high; i++){
            if(i % 5 == 0)
                continue;
            System.out.println(i);
        }
    }
}
