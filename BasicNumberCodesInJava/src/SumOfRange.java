import java.util.Scanner;

public class SumOfRange{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();

        SumOfRange add = new SumOfRange();
        System.out.println("The sum of numbers from " +a+ " to " +b+ " is " +add.findSum(a,b));

    }

    public int findSum(int num1,int num2){
        int sum  = 0;
        for(int i = num1; i <= num2; i++) {
            sum += i;
        }
        return sum;
    }
}