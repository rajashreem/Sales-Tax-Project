package main;

/**
 * Created by IntelliJ IDEA.
 * User: rajashre
 * Date: 7/9/11
 * Time: 6:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class NonTaxableItem extends Item
{
    private double taxOfImport;
    private double totalTax = 0.0;
    RoundValueGenerator rounder = new RoundValueGenerator();

    public NonTaxableItem(String itemName, double price, int quantity, boolean isImported) throws WrongInputException {
        super(itemName, price, quantity, isImported);
    }

    @Override
    public double calculateTax()
    {
       if(isImported)
       {
           taxOfImport = 0.05 * calculatePlainCost();
           totalTax = rounder.roundToNearestDecimalFive(taxOfImport);
           return totalTax;
       }
       else
           return totalTax;
    }
}
