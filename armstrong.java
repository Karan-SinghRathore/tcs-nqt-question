import java.util.*;
public class armstrong {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        int  original_n = n , sum = 0 , digits = String.valueOf(n).length();

        while(n>0){
            int d = n % 10;
            sum += Math.pow(d, digits);
            n /= 10;
        }
        if(sum == original_n){
            System.out.println("The Number is ArmStrong");
        }
        else{
            System.out.println("The Number is not ArmStrong");
        }
        sc.close();
    }
}
