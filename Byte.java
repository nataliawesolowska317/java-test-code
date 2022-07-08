package com.company;

public class Byte {
    public static void main(String[] args) {

        int array[] = {2, 5, 8, 13, 7, 22, 78, 44};
        int i = 0;

        System.out.println("Zawartość tablicy to: ");
        while (i < array.length) {
            System.out.println("Tablica [" + i + "] = " + array[i]);
            i++;
        }
        int size = array.length;
        System.out.println("Rozmiar tablicy to: " + array.length);
    }
}