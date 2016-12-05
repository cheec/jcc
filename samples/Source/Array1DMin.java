import java.util.*;

public class Array1DMin {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        System.out.print("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        int minimum = getMinimum(arr);
        System.out.println("Minimum: " + minimum);
    }

    private static int getMinimum(int[] arr) {
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        
        return min;
    }
}
