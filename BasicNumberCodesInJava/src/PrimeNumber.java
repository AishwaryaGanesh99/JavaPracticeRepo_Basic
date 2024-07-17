package BasicNumberCodesInJava.src;

import java.util.Scanner;

public class PrimeNumber{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        PrimeNumber pn =  new PrimeNumber();
        pn.checkPrime(n);

    }

    public void checkPrime(int num) {
        boolean isPrime = true; // Assume the number is prime initially

        if (num < 2) {
            isPrime = false; // Numbers less than 2 are not prime
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false; // Found a divisor, so it's not prime
                    break; // No need to continue checking
                }
            }
        }

        if (isPrime) {
            System.out.println("The given number is prime.");
        } else {
            System.out.println("The given number is not prime.");
        }
    }


}
