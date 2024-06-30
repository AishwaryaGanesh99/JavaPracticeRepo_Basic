package BasicNumberCodesInJava.src;

import java.util.Scanner;

public class GreatestOfTwo {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();

        GreatestOfTwo gt = new GreatestOfTwo();
        System.out.println("The greatest number among "+a+ " and "+b+ " is "+ gt.find(a,b));

    }

    static int find(int num1, int num2){
        if(num1 > num2){
            return num1;
        } else {
            return num2;
        }
    }

}
