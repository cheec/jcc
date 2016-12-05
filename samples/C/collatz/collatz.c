// CS1010 AY2016/7 Semester 1
// PE1 Ex1: collatz.c

#include <stdio.h>

void displayCollatzInternal(int, int);

int main(void) {
    // Get user input
    printf("Enter positive numbers for n and count: ");

    int n, count;
    scanf("%d%d", &n, &count);

    printf("\n");

    // display the internal execution of Collatz's sequence
    displayCollatzInternal(n, count);

    return 0;
}

void displayCollatzInternal(int n, int count) {    
    printf("The collatz sequence is: ");

    int div_executed_count = 0;
    int mul_executed_count = 0;

    while (n != 1 && count) {
        if (n % 2) { // odd
            n = 3 * n + 1;
            mul_executed_count++;
        } else { // even
            n /= 2;
            div_executed_count++;
        }

        count--;
        printf("%d ", n);    
    }
    printf("\n");

    printf("The division statement has been executed %d times.\n", div_executed_count);
    printf("The multiplication statement has been executed %d times.\n", mul_executed_count);
}
