import java.util.*;
public class Leap_year {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int n = sc.nextInt();
        if (n % 4 == 0 && n % 100 != 0 || n % 400 == 0){
            System.out.println("The Year is Leap Year");
        }
        else{
            System.out.println("The Year is not Leap Year");
        }
    }
    
}
