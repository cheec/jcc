import java.util.*;

public class Array2DPrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        /*
         * Getting user input
         */
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of cols: ");
        int cols = sc.nextInt();
        
        int[][] arr = new int[rows][cols];
        
        System.out.println("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        printRowByRow(arr);
        
        printColByCol(arr);
    }

    private static void printColByCol(int[][] arr) {
        System.out.println("printing each col on new line: ");
        
        for (int c = 0; c < arr[0].length; c++) {
            for (int r = 0; r < arr.length; r++) {
                System.out.print(arr[r][c] + " ");
            }
            System.out.println();
        }
        
    }

    private static void printRowByRow(int[][] arr) {
        System.out.println("printing each row on new line: ");
        
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[0].length; c++) {
                System.out.print(arr[r][c] + " ");
            }
            System.out.println();
        }
    }
}
