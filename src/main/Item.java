package main;

import java.io.DataOutput;

/**
 * Created by IntelliJ IDEA.
 * User: rajashre
 * Date: 7/7/11
 * Time: 2:35 PM
 * To change this template use File | Settings | File Templates.
 */

public class Item {
    public double calculateCostAfterTax(String itemName, int quantity, double price )
    {
        double tax = 0.0;
        double cost = 0.0;

        cost = price * quantity;

        if(itemName.contains("import"))
        {
              tax = 0.05 * price * (double)quantity;
              cost += tax;
        }
        if(!(itemName.contains("book")||itemName.contains("pills")||itemName.contains("chocolate")))
        {
            tax = 0.1 * price * (double)quantity;
            cost += tax;
        }

        return cost;

    }
}
