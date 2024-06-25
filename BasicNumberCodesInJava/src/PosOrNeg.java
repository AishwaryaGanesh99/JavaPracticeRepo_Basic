import java.util.Scanner;

public class PosOrNeg{

    public static void main(String[] args){

        Scanner sc  =  new Scanner(System.in);
        System.out.println("Enter the number to be checked");
        int number = sc.nextInt();

        PosOrNeg check = new PosOrNeg();
        check.checkNumber(number);
    }

    public void checkNumber(int num){
        if(num > 0){
            System.out.println(+num+ " is positive");
        } else if (num < 0) {
            System.out.println(+num+ " is negative");
        } else {
            System.out.println("Zero/0 is neither positive nor negative");
        }
    }

}