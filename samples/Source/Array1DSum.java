import java.util.*;

public class Array1DSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        System.out.print("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        int sum = sumArray(arr);
        System.out.println("Total array sum: " + sum);
    }

    private static int sumArray(int[] arr) {
        int sum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        
        return sum;
    }
}
