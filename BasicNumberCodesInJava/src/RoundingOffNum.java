package BasicNumberCodesInJava.src;

import java.util.Scanner;

public class RoundingOffNum{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        double number = sc.nextDouble();

        RoundingOffNum a = new RoundingOffNum();
        a.round(number);

    }

    public void round(double num){

          double ceil  = Math.ceil(num);
          double floor = Math.floor(num);
          long round = Math.round(num);

        System.out.println("The ceil value is " +ceil);
        System.out.println("The floor value is " +floor);
        System.out.println("The rounded value is " +round);

        }

    }
