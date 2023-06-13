package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main  {
    public static void main(String[] args) {
        boolean resultA = 2 <= 2 && !true;
        boolean resultB = !false && 3 > 2;
        boolean resultC = !(!false || true);
        boolean resultD = 6 > 6 ^ !(true && true);

        System.out.println("Result A: " + resultA);
        System.out.println("Result B: " + resultB);
        System.out.println("Result C: " + resultC);
        System.out.println("Result D: " + resultD);
    }
}
