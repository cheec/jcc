// CS1010 AY2016/7 Semester 1
// PE1 Ex1: collatz.c

import java.util.*;

public class Collatz { // Class names are in UpperCamelCase

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter positive numbers for n and count: ");  
           
        int n = sc.nextInt();
        int count = sc.nextInt();
        
        System.out.println(); // equivalent to System.out.print("\n");
        
        // display the internal execution of Collatz's sequence
        displayCollatzInternal(n, count);
    }
    
    public static void displayCollatzInternal(int n, int count) {
        System.out.print("The collatz sequence is: ");
    
        // Variables in lowerCamelCase
        int divExecutedCount = 0;
        int mulExecutedCount = 0;
        
        // In Java, you can no longer use non-zero numbers to denote 'true'
        while (n != 1 && count > 0) { 
            if (n % 2 != 0) { // odd
                n = 3 * n + 1;
                mulExecutedCount++;
            } else { // even
                n /= 2;
                divExecutedCount++;
            }
            
            count--;
            System.out.print(n + " "); 
        }
        System.out.println();
        
        System.out.println("The division statement has been executed " + divExecutedCount + " times.");
        System.out.println("The multiplication statement has been executed "+ mulExecutedCount + " times.");

    }
}