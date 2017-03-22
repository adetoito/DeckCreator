package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scString = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);

        int cardsInEachSuit;
        int amtOfSuits = 1;
        String [] suits;
        String [] deck;

        boolean deciding = true;

        while (deciding) {
            System.out.print("Amount of cards in each suit: ");
            /*
            if (cardsInEachSuit % 2 == 0 || cardsInEachSuit % 2 == 1) {
                deciding = false;
            } else {

            }
            */
            try {
                cardsInEachSuit = scInt.nextInt();
                deciding = false;
            } catch (InputMismatchException ime) {
                System.out.println("Invalid data type.\n");
            }
        }

        deciding = true;
        while (deciding) {
            System.out.print("\nHow many different suits: ");
            try {
                amtOfSuits = scInt.nextInt();
                deciding = false;
            } catch (InputMismatchException ime) {
                System.out.println("Invalid data type.\n");
            }
        }
        suits = new String [amtOfSuits];

        thisThingy:
        for (int i = 0; i <= suits.length; i++) {
            System.out.print("\nName of suit " + (i + 1) + ": ");
            String suitName = scString.nextLine();
            if (suitName.equals(null)) {
                System.out.println("Invalid input.\n");
                i--;
            } else {
                suits[i] = suitName;
            }
            if (i + 1 == suits.length) {
                break thisThingy;
            }
        }
    }
}
