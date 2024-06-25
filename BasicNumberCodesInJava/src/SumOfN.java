import java.util.Scanner;

public class SumOfN {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int limit = sc.nextInt();

        SumOfN b = new SumOfN();
        System.out.println("The sum of digits from 1 to " +limit+ " is " + b.add(limit));
    }

    public int add(int num){

        int sum = 0;
        for(int i = 1; i <= num; i++){
            sum += i;
        }
        return sum;
    }
}
