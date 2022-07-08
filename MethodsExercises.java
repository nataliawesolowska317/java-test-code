package com.company;

import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        int a = scanner.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        int b = scanner.nextInt();
        System.out.println("Podaj trzecią liczbę: ");
        int c = scanner.nextInt();

        int longestSide;
        int otherSide1;
        int otherSide2;

        if(a > b) {
            if (a > c) {
                longestSide = a;
                otherSide1 = b;
                otherSide2 = c;
            } else {
                longestSide = c;
                otherSide1 = a;
                otherSide2 = b;
            }
        } else {
            if(b > c) {
                longestSide = b;
                otherSide1 = a;
                otherSide2 = c;
            } else {
                longestSide = c;
                otherSide1 = a;
                otherSide2 = b;
            }
        }

        System.out.println(checkIfTriangleIsPossible(longestSide, otherSide1, otherSide2));
    }

    private static boolean checkIfTriangleIsPossible(int arg1, int arg2, int arg3) {
        if (arg1 > (arg2 + arg3)) {
            System.out.println("Udało się zbudować trójkąt");
            return true;
        } else {
            System.out.println("Nie udało się zbudować trójkąta");
            return false;
        }

    }
}
