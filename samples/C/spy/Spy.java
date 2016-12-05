
// CS1010 AY2016/7 Semester 1
// PE2 Ex1: spy.c

import java.util.*;

public class Spy {

    /*
     * This is how we define a constant in Java, with the static and final keywords
     * static - makes it a class variable
     * final - this variable can only be assigned once and only once.
     * 
     */
    public static final int ALPHABET_SIZE = 26;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter keyword: ");
        String keyword = sc.next();

        System.out.print("Enter message: ");
        String message = sc.next();

        // Strings in Java are immutable (can't modify), so we have to return a new String object.
        keyword = simplify(keyword);
        String alphabet = createAlphabet(keyword);
        String result = encrypt(message, alphabet);

        System.out.println("Encrypted message: " + result);
    }

    public static String simplify(String keyword) {
        /*
         * A Set is like a container. In this case, we have a Set<Character>. 
         * Simply meaning we now have an empty container for Characters. 
         * 
         * Note how we can do 
         *     String simplified = ""; 
         * instead of 
         *     String simplified = new String();
         * 
         * They are equivalent for all intensive purposes, but for the interested, visit:
         *     http://stackoverflow.com/questions/3052442/what-is-the-difference-between-text-and-new-stringtext
         */
        Set<Character> duplicates = new HashSet<Character>();
        String simplified = "";

        /* 
         * In Java, we can declare our 'i' iterators within the 'for' clause itself 
         */
        for (int i = 0; i < keyword.length(); i++) {
            /*
             * If our 'duplicates' container doesn't contain this character, then this is a unique occurrence
             */
            if (!duplicates.contains(keyword.charAt(i))) {
                /*
                 * Here we make use of the concatenation operator '+' in Java
                 * We also use '+=' as a shorthand for 
                 *     simplified = simplified + keyword.charAt(i);
                 * 
                 * We then log the unique occurrence in our 'duplicates' container by adding 
                 * the unique character to it
                 */
                simplified += keyword.charAt(i);
                duplicates.add(keyword.charAt(i));
            }
        }

        return simplified;
    }

    public static String createAlphabet(String keyword) {
        String alphabet = keyword;

        for (int i = 0; i < ALPHABET_SIZE; i++) {
            /*
             * Here we use Java's indexOf method for Strings. This method returns a '-1' when it can't find the
             * specified character within the String calling the method.
             */
            if (keyword.indexOf(i + 'a') == -1) {
                alphabet += (char) (i + 'a');
            }
        }

        return alphabet;
    }

    public static String encrypt(String message, String alphabet) {
        String result = "";

        for (int i = 0; i < message.length(); i++) {
            /*
             * We use the Character class methods, similar to how we use Math methods of Java.
             * As we can see, Java is extremely API reliant and powerful in terms of its
             * methods and functionality. It would only serve to your advantage if you
             * learn the commonly used methods of the Java API.
             */
            char c = message.charAt(i);

            if (Character.isUpperCase(c)) {
                result += Character.toUpperCase(alphabet.charAt(c - 'A'));
            } else {
                result += alphabet.charAt(c - 'a');
            }
        }

        return result;
    }
}
