package com.company;

import java.util.Scanner;

public class Dividing extends Main {

    public static void main(String[] args) {
        int firstNumber2 = 80, secondNumber2 = 10;

        System.out.println("Pierwsza liczba to: " + firstNumber2);
        System.out.println("Druga liczba to: " + secondNumber2);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wynik dzielenia " + firstNumber2 + " i " + secondNumber2);
        int resultOfDivision = 0;

        int numberOfGuesses2 = 0;

        while (resultOfDivision != 8) {
            resultOfDivision = scanner.nextInt();
            System.out.println("Nie udało się.");
            numberOfGuesses2++;
        }
            System.out.println("Udało się! Liczba prób to: " + numberOfGuesses2);
        }
    }
