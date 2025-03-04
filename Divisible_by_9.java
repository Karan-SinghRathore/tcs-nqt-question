import java.util.*;
public class Divisible_by_9{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: hello");
        int n = sc.nextInt();
        int sum = 0;
        while(n>0){
            int nine = n%10;
            sum = sum + nine;
            n = n /10;
        }
        if(sum % 9 == 0){
            System.out.println("Number is divisible by 9");
        }
        else{
            System.out.println("Number is not divisible by 9");
        }
        sc.close();
    }
}