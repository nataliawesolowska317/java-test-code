package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        enum Month {
            STYCZEŃ, LUTY, MARZEC, KWIECIEŃ, MAJ, CZERWIEC, LIPIEC, SIERPIEŃ, WRZESIEŃ, PAŹDZIERNIK, LISTOPAD, GRUDZIEŃ
        }

        String[] months = new String[]{"styczeń", "luty", "marzec", "kwiecień", "maj", "czerwiec", "lipiec", "sierpień", "wrzesień", "październik", "listopad", "grudzień"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę miesiąca: ");
        String nameOfTheMonth = scanner.next().toUpperCase();

        switch (nameOfTheMonth) {

            case "styczeń":
                System.out.println("Styczeń ma 31 dni");
                break;
            case "luty":
                System.out.println("Luty ma 28 dni");
                break;
            case "marzec":
                System.out.println("Marzec ma 31 dni");
                break;
            case "kwiecień":
                System.out.println("Kwiecień ma 30 dni");
                break;
            case "maj":
                System.out.println("Maj ma 31 dni");
                break;
            case "czerwiec":
                System.out.println("Czerwiec ma 30 dni");
                break;
            case "lipiec":
                System.out.println("Lipiec ma 31 dni");
                break;
            case "sierpień":
                System.out.println("Sierpień ma 31 dni");
                break;
            case "wrzesień":
                System.out.println("Wrzesień ma 30 dni");
                break;
            case "październik":
                System.out.println("Październik ma 31 dni");
                break;
            case "listopad":
                System.out.println("Listopad ma 30 dni");
                break;
            case "grudzień":
                System.out.println("Grudzień ma 31 dni");
                break;
            default:
                System.out.println("Nieprawidłowa nazwa miesiąca");
                break;
        }


        System.out.println("Podaj rok: ");
        int year = scanner.nextInt();
        System.out.println("Rok " + year + " jest " + (checkIfYearIsLeapOrCommon(year) ? "przestępny" : "nie przestępny"));
    }

    public static boolean checkIfYearIsLeapOrCommon(int year) {
        if (year % 4 == 0) {
            System.out.println("Jest to rok przystępny");
            return true;
        } else {
            System.out.println("Nie jest to rok przystępny");
            return false;
        }
    }
}