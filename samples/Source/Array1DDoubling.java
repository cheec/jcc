import java.util.Scanner;

public class Array1DDoubling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        /*
         * Getting user input
         */
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        System.out.print("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        /*
         * Two ways to double an array: 
         * 1. creating a new array with elements doubled, 
         * 2. or double the original array's elements
         */
        
        /*
         * 1. creating a new array with elements doubled
         * Demonstrating returning an array object from method
         */
        int[] doubled = makeDoubled(arr);
        
        System.out.print("new 'doubled' array: ");
        for (int i = 0; i < doubled.length; i++) {
            System.out.print(doubled[i] + " ");
        }
        System.out.println(); // new line
        
        /*
         * 2. double original array's elements
         * Demonstrating pass by value of Java
         */
        doubleElements(arr);
        
        System.out.print("'arr' doubled: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // new line
    }

    private static int[] makeDoubled(int[] arr) {
        int[] newArr = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = 2 * arr[i];
        }
        
        return newArr;
    }

    // demonstrates pass by value i.e. can modify 'arr' itself 
    private static void doubleElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
    }
    
    
}