package bai1_introduction_to_java.exercise;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int RATE_DOLLAR = 25000;
        final double RATE_VND = 0.00004;
        boolean check = true;

        while (check) {
            System.out.println("Enter the currency you want to convert: \n" +
                    "1.From USD to VND \n" +
                    "2.From VND to USD \n" +
                    "3.Quit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter a number of currency: ");
                    int numberUsd = scanner.nextInt();
                    int resultVnd = numberUsd * RATE_DOLLAR;
                    System.out.println("From USD converted to VND: " + resultVnd);
                    break;
                case 2:
                    System.out.println("Enter a number of currency: ");
                    int numberVnd = scanner.nextInt();
                    double resultDollar = numberVnd * RATE_VND;
                    System.out.println("From VND converted to USD: " + resultDollar);
                    break;
                case 3:
                    check = false;
                    break;
                default:
                    System.out.println("can not do this");
                    break;
            }
        }
    }
}
