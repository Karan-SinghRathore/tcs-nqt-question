import java.util.*;
public class fibonnaci {
    public static void main (String [] args){
        int a = 0 ; int b = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        System.out.println("The Fibonnaci Series of " + n + " Elements  are: ");
        for(int i = 0 ; i < n; i++){
            System.out.print(a + " ");
            int next = a +b;
            a= b;
            b = next;
        }
    }
    
}
