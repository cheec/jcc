// CS1010 AY2016/7 Semester 1
// PE2 Ex1: spy.c

#include <stdio.h>
#include <string.h>
#include <ctype.h>
#define ALPHABET_SIZE 26
#define MAX_LENGTH 80

void createAlphabet(char [], char []);
void encrypt(char [], char[], char []);
void simplify(char []);

// Do NOT change the main function!
int main(void) {
    char keyword[MAX_LENGTH+1], alphabet[ALPHABET_SIZE+1], message[MAX_LENGTH+1], result[MAX_LENGTH+1];

    printf("Enter keyword: ");
    scanf("%s", keyword);

    printf("Enter message: ");
    scanf("%s", message);

    simplify(keyword);
    createAlphabet(keyword, alphabet);
    encrypt(message, alphabet, result);

    printf("Encrypted message: %s\n", result);

    return 0;
}

void simplify(char keyword[]) {
    int duplicates[26] = {0};
    char simplified[MAX_LENGTH + 1] = {0};
    int i, j = 0;

    for (i = 0; keyword[i] != '\0'; i++) {
        if (!duplicates[keyword[i] - 'a']) { // not a duplicate
            simplified[j++] = keyword[i];
            duplicates[keyword[i] - 'a'] = 1;
        }         
    }

    strcpy(keyword, simplified);
}

void createAlphabet(char keyword[], char alphabet[]) {
    strcpy(alphabet, keyword);
    int i, j = strlen(keyword);

    for (i = 0; i < ALPHABET_SIZE; i++) {
        if (strchr(keyword, i + 'a') == NULL) { // letter can't be found in keyword
            alphabet[j++] = i + 'a';
        }        
    }
    alphabet[ALPHABET_SIZE] = '\0';
}

void encrypt(char message[], char alphabet[], char result[]) {
    int len = strlen(message);
    int i;

    for (i = 0; i < len; i++) {
        if (isupper(message[i])) {
            result[i] = toupper(alphabet[message[i] - 'A']);
        } else {
            result[i] = alphabet[message[i] - 'a'];
        }
    }

    result[i] = '\0';
}