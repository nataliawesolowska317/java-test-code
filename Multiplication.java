package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int firstNumber = 10;
        int secondNumber = 20;

        System.out.println("Pierwsza liczba to: " + firstNumber);
        System.out.println("Druga liczba to: " + secondNumber);

        int numberOfGuesses = 0;

        System.out.println("Jaki będzie wynik mnożenia pierwszej i drugiej liczby?");
        Scanner scanner = new Scanner(System.in);
        int resultOfMultiplication;

        do {
            resultOfMultiplication = scanner.nextInt();
            numberOfGuesses++;
            System.out.println("Liczba prób to: " + numberOfGuesses);
        } while (resultOfMultiplication != 200);

            System.out.println("Umiesz mnożyć! Zgadłeś za: " + numberOfGuesses + " razem.");
    }
}
