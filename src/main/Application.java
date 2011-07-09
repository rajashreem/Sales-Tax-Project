package main;

/**
 * Created by IntelliJ IDEA.
 * User: rajashre
 * Date: 7/8/11
 * Time: 3:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class Application {
    public static void main(String[] args) throws WrongInputException
    {
        Item item = item = new TaxableItem("perfume", 18.99, 1, false);

        double cost = item.calculateTotalCostAfterTax();
        System.out.println("\n cost of item " + item.itemName +" after tax is :"+ cost);
    }
}
