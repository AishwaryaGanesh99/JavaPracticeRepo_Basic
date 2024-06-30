package BasicNumberCodesInJava.src;

import java.util.Scanner;

public class SqrtAndCbrt{

    public double square(double num){
        double sq = 0;
        sq = Math.sqrt(num);
        return sq;
    }

    public double cube(double num){
        double cb = 0;
        cb = Math.cbrt(num);
        return cb;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        double num = sc.nextDouble();

        SqrtAndCbrt rt = new SqrtAndCbrt();

        System.out.println("The square root of " +num+ " is "+rt.square(num));
        System.out.println("The cube root of " +num+ " is " +rt.cube(num));

    }
}