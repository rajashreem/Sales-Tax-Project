package test;

import main.NonTaxableItem;
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
public class TestNonTaxableItem {
    @Test
    public void costOfOneBookWithPriceTenIsTen() throws Exception
    {
        assertEquals(10.0,new NonTaxableItem("book", 10.0, 1, false).calculateTotalCostAfterTax());
    }

    @Test
    public void costOfBookWithPriceFifteenIsFifteen() throws Exception
    {
        assertEquals(15.0, new NonTaxableItem("book", 15.0, 1, false).calculateTotalCostAfterTax());
    }

    @Test
    public void costOfTwoBooksWithPriceFifteenIsThirty() throws Exception
    {
        Assert.assertEquals(30.0, new NonTaxableItem("book", 15.0, 2, false).calculateTotalCostAfterTax());
    }

    @Test
    public void costOfBookWithPriceTwelvePointFortyNineIsTwelvePointFortyNine() throws Exception
    {
        Assert.assertEquals(12.49, new NonTaxableItem("book", 12.49, 1, false).calculateTotalCostAfterTax());
    }

    @Test
    public void costOfChocolateWithPricePointEightyFiveIsPointEightyFive() throws Exception
    {
        assertEquals(0.85,new NonTaxableItem("chocolate", 0.85, 1, false).calculateTotalCostAfterTax());
    }

    @Test
    public void costOfHeadachePillsWithPriceNinePointSeventyFiveIsNinePointSeventyFive() throws Exception
    {
        assertEquals(9.75,new NonTaxableItem("headache_pills", 9.75, 1, false).calculateTotalCostAfterTax());
    }

    @Test
    public void costOfImportedChocolateBarWithPriceTenIsTenPointFive() throws Exception
    {
        assertEquals(10.50,new NonTaxableItem("imported_chocolate", 10.00, 1, true).calculateTotalCostAfterTax());
    }

    @Test
    public void costOfTwoImportedBooksWithPriceHundredIsTwuHundredAndTen() throws Exception
    {
        assertEquals(210.0,new NonTaxableItem("imported_books", 100.0, 2, true).calculateTotalCostAfterTax());
    }
}
