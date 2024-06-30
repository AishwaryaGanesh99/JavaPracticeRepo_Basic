package BasicNumberCodesInJava.src;

import java.util.Scanner;

public class Power {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base");
        int base = sc.nextInt();
        System.out.println("Enter the exponent");
        int exp = sc.nextInt();

        Power pw = new Power();
        System.out.println("The power of "+base+ " to "+exp+ " is "+pw.pow(base,exp));

    }

    static int pow(int base, int exp){
        int power = 1;

        for(int i = 1; i <= exp; i++){
            power *= base;
        }
        return power;
    }
}
