package main;

/**
 * Created by IntelliJ IDEA.
 * User: rajashre
 * Date: 7/9/11
 * Time: 5:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class TaxableItem extends Item{

    private double taxOfImport;
    private double plainTax;
    private double totalTax;
    RoundValueGenerator rounder = new RoundValueGenerator();


    public TaxableItem(String itemName, double price, int quantity, boolean isImported) throws WrongInputException {
        super(itemName, price, quantity, isImported);
    }

    @Override
    public double calculateTax() {
        if(isImported)
        {
            plainTax = calculatePlainTax();
            taxOfImport = 0.05 * calculatePlainCost();
            taxOfImport = rounder.roundToNearestDecimalFive(taxOfImport);
            totalTax = plainTax + taxOfImport;
            return totalTax;
        }

        else
        {
            totalTax = calculatePlainTax();
            return totalTax;
        }

    }

    private double calculatePlainTax() {
        plainTax = 0.1 * calculatePlainCost();
        plainTax = rounder.roundToNearestDecimalFive(plainTax);
        return plainTax;
    }
}
