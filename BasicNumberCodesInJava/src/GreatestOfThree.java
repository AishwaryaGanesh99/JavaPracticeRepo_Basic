package BasicNumberCodesInJava.src;

import java.util.Scanner;

public class GreatestOfThree{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number");
        int num2 = sc.nextInt();
        System.out.println("Enter the third number");
        int num3 = sc.nextInt();

        GreatestOfThree gs = new GreatestOfThree();
        System.out.println(gs.find(num1,num2,num3) + " is the greatest number among "+num1+","+num2+","+num3);

    }

    static int find(int a, int b, int c){
        if(a > b && a > c){
            return a;
        } else if (b > a && b > c){
            return b;
        } else {
            return c;
        }
    }


}