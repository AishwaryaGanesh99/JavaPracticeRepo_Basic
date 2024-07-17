package BasicNumberCodesInJava.src;

import java.util.Scanner;

public class LeapYear{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = sc.nextInt();

        LeapYear cy = new LeapYear();

        if(cy.checkYear(year)){
            System.out.println("The year "+year+ " is a leap year");
        } else {
            System.out.println("The year "+year+ " is not a leap year");
        }



    }

    public boolean checkYear(int year){
        boolean result;

        if(year % 400 == 0){
            result = true;
        } else if (year % 4  == 0 && year % 100 != 0){
            result = true;
        } else {
            result = false;
        }

        return result;
    }

}