package main;


/**
 * Created by IntelliJ IDEA.
 * User: rajashre
 * Date: 7/7/11
 * Time: 2:35 PM
 * To change this template use File | Settings | File Templates.
 */

public abstract class Item {

    private String itemName;
    private double price;
    private int quantity;
    protected boolean isImported = false;

    private double plainCost;
    private double totalCost;

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
        RoundValueGenerator rounder = new RoundValueGenerator();
        plainCost = rounder.roundToTwoDecimalPlaces(plainCost);
        return plainCost;
    }

    public double calculateTotalCostAfterTax()
    {
        double tax = calculateTax();
        RoundValueGenerator rounder = new RoundValueGenerator();
        totalCost = calculatePlainCost() + calculateTax();
        totalCost = rounder.roundToTwoDecimalPlaces(totalCost);
        return totalCost;
    }

}
//    {
//        double tax = 0.0;
//        double roundedTax = 0.0;
//        double totalTax = 0.0;
//        double cost = 0.0;
//        RoundValueGenerator rounder = new RoundValueGenerator();
//
//        cost = price * quantity;
//        System.out.println("actual price:"+cost);
//
//        if(itemName.contains("import"))
//        {
//          tax = 0.05 * price * quantity;
//          roundedTax = rounder.roundToNearestDecimalFive(tax);
//          System.out.println("Tax because of import is:"+roundedTax);
//          cost += roundedTax;
//          totalTax += roundedTax;
//          tax = 0.0;
//        }
//
//        if(!(itemName.contains("book")||itemName.contains("pills")||itemName.contains("chocolate")))
//        {
//            tax = 0.1 * price * quantity;
//            roundedTax = rounder.roundToNearestDecimalFive(tax);
//            System.out.println("Tax for non-exemptable:"+roundedTax);
//            totalTax += roundedTax;
//            cost += roundedTax;
//        }
//
//        System.out.println("Total tax is:" + rounder.roundToTwoDecimalPlaces(totalTax));
//        cost = rounder.roundToTwoDecimalPlaces(cost);
//        return cost;
//    }

