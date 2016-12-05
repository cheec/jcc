import java.util.Scanner;

public class Array1DSumEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        System.out.print("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        int sum = sumEvens(arr);
        System.out.println("Total even elements sum: " + sum);
    }

    private static int sumEvens(int[] arr) {
        int sum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) { // no remainder after dividing by 2 i.e. even
                sum += arr[i];
            }
        }
        
        return sum;
    }
}