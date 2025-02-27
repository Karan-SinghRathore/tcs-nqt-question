import java.util.*;
public class SumOfGivenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Elements in Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i<n ; i++){
            System.out.println("Enter the "+ i +" Element of Array : ");
            arr[i]= sc.nextInt();
        }
        int sum = 0 ;
        System.out.print("Array elements: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for(int num : arr){ 
            sum += num;
        }
        System.out.println("\nSum of the Aarray is : " + sum);
        sc.close();
    }
}
