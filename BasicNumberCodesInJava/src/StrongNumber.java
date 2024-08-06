package BasicNumberCodesInJava.src;

import java.util.Scanner;

public class StrongNumber{

    public int fact(int num){

        int factorial = 1;

        for(int i = 1; i <= num; i++){
            factorial = factorial * i;
        }

        return factorial;
    }

    public boolean ifStrong(int num){

        int temp = num;
        int sum = 0;

        while(temp != 0){
            int digit = temp % 10;
            sum = sum + fact(digit);
            temp = temp/10;
        }

        if(num==sum){
            return true;
        }
        else {
            return false;
        }

    }

    public static void main(String[] args){

        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();

        StrongNumber a = new StrongNumber();
        System.out.println(a.ifStrong(number));
        }

    }