package main;


/**
 * Created by IntelliJ IDEA.
 * User: rajashre
 * Date: 7/7/11
 * Time: 2:35 PM
 * To change this template use File | Settings | File Templates.
 */

public abstract class Item {
    RoundValueGenerator rounder = new RoundValueGenerator();

    protected String itemName;
    protected double price;
    protected int quantity;
    protected boolean isImported = false;

    public double plainCost;
    public double totalCost;

    public Item(String itemName, double price, int quantity, boolean isImported) throws WrongInputException
    {
        if (CheckStringInput.isStringEmpty(itemName))
            throw new WrongInputException("Item name can not be empty");
        if(price <= 0)
            throw new WrongInputException("Price can nat be zero or negative");
        if(quantity <= 0)
            throw new WrongInputException("Quantity can not be zero or negative");

        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
        this.isImported = isImported;
    }

    public abstract double calculateTax();

    public double calculatePlainCost()
    {
        plainCost = price * quantity;
        plainCost = rounder.roundToTwoDecimalPlaces(plainCost);
        return plainCost;
    }

    public double calculateTotalCostAfterTax()
    {
        double tax = calculateTax();
        totalCost = calculatePlainCost() + calculateTax();
        totalCost = rounder.roundToTwoDecimalPlaces(totalCost);
        return totalCost;
    }

}
