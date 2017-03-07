/*
 Author= Prerna
 Roll Number=1410110306


This program takes the pattern and an input string and returns the position of the substring if found

 */
package patternmatching;

import java.util.Scanner;

public class PatternMatching {

    static String pattern;
    static String input;
    static int k = 1;

    public static int Compute_Transition_Function(String pattern, String input) {

        String temp;
        char temp2;
        String Pq = "";
        int m = input.length();
        for (int q = 0; q < m; q++) {
            temp2 = input.charAt(q);
            Pq = Pq + temp2;
            k = Math.min(k + 1, q + 1);
            while (isSubset(Pq, q, k) == false) {
                k = k - 1;
            }
            if (k == pattern.length()) {
                return (q + 1 - pattern.length());
            }
        }

        return -1;

    }

    public static boolean isSubset(String readSoFar, int q, int k) {
        boolean value = true;
        if (k == 0) {
            return true;
        }
   
        if (readSoFar.charAt(q) != pattern.charAt(k - 1)) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the pattern");
        pattern=s.nextLine();
        System.out.println("Enter the input string");
        input=s.nextLine();
        int output = Compute_Transition_Function(pattern, input);
        if (output > -1) {
            System.out.println("Found Pattern Match with shift of " + output);
        } else {
            System.out.println("Match not found");
        }
    }

}
