package main;

/**
 * Created by IntelliJ IDEA.
 * User: rajashre
 * Date: 7/7/11
 * Time: 2:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class Item {
    public double calculateCostAfterTax(String itemname, int quantity, double price )
    {
        return price*(double)quantity;
    }
}
