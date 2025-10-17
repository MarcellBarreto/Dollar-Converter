package Application;

import Entities.Converter;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double quantityDollar = sc.nextDouble();

        double c = Converter.CurrencyConverter(dollarPrice, quantityDollar);

        System.out.printf("Amount to be paid in reais = %.2f%n", c);

        sc.close();
    }
}