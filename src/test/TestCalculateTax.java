package test;
import main.Item;
import org.testng.Assert;
import org.testng.annotations.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * User: rajashre
 * Date: 7/7/11
 * Time: 3:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestCalculateTax {
    @Test
    public void costOfOneBookWithPriceTenIsTen() throws Exception
    {
        assertEquals(10.0,calculateTotalCostOfItem("book",1,10.0));
    }

    @Test
    public void costOfBookWithPriceFifteenIsFifteen() throws Exception
    {
        Assert.assertEquals(15.0,calculateTotalCostOfItem("book",1,15.0) );
    }

    @Test
    public void costOfTwoBooksWithPriceFifteenIsThirty() throws Exception
    {
        Assert.assertEquals(30.0, calculateTotalCostOfItem("book", 2, 15.0));
    }

    @Test
    public void costOfBookWithPriceTwelvePonitFourtyNineIsThirty() throws Exception
    {
        Assert.assertEquals(12.49, calculateTotalCostOfItem("book",1,12.49));
    }

    private double calculateTotalCostOfItem(String book, int quantity, double price)
    {
        return new Item().calculateCostAfterTax(book, quantity, price);
    }
}
