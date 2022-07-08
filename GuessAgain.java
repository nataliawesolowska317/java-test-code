package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GuessAgain {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz dowolną liczbę: ");
        int inputNumber = 0;
        List<Integer> inputNumbers = new ArrayList<>();

        do {
            inputNumber = scanner.nextInt();

            if (inputNumber > 0) {
                inputNumbers.add(inputNumber);
            }
        }
        while (inputNumber > 0);


        int min = inputNumbers.get(0);

        for (Integer number : inputNumbers) {
            if (number < min) {
                min = number;
            }
        }

        System.out.println("Najmniejsza wpisana liczba to: " + min);


        int max = inputNumbers.get(0);

        for (int i = 0; i < inputNumbers.size(); i++) {

            Integer number = inputNumbers.get(i);

            if (number > max) {
                max = number;

            }

        }

        System.out.println("Największa wpisana liczba to: " + max);

    }
}
