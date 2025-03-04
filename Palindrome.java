import java.util.*;
public class Palindrome {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number ");
        int n = sc.nextInt();
        int original_n = n ,  reverse =0;
        while(n>0){
            int digit = n%10;
            reverse = reverse*10 + digit;
            n /= 10; 
        }
        if(reverse == original_n){
            System.out.println("The number is palindrome");
        }
        else{
            System.out.println("The number is not palindrome");
        }
        sc.close();
    }
}
