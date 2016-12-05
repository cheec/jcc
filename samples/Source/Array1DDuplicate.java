import java.util.*;

public class Array1DDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        System.out.print("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        boolean hasDuplicate = hasDuplicate(arr);
        System.out.println("This array has duplicates: " + hasDuplicate);
    }

    // brute force solution
    private static boolean hasDuplicate(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        
        return false;
    }
}
