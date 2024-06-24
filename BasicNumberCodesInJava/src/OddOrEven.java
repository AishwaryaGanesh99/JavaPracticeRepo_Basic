import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        OddOrEven a = new OddOrEven();
        System.out.println( a.check(n));
    }

    public String check(int num){
        String result = "";
        if(num % 2 == 0){
            result = "Even";
        } else {
            result = "Odd";
        }
        return result;
    }
}
