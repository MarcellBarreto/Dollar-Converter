package Entities;

public class Converter {
    public static final double IOF = 0.06;

    public static double CurrencyConverter(double dollarPrice, double quantityDollar){
        double grossTotal = quantityDollar * dollarPrice;
        double netTotal = grossTotal + (grossTotal * IOF);
        return netTotal;
    }
}
