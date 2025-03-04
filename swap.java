import java.util.*;
public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number:");
        int a = sc.nextInt();
        System.out.println("Enter the second Number:");
        int b = sc.nextInt();
        System.out.println("Before swapping");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        int temp = 0;
        temp = b;
        b = a;
        a = temp;
        System.out.println("After swapping");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        sc.close();
    }
}
