package main;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: rajashre
 * Date: 7/10/11
 * Time: 12:01 AM
 * To change this template use File | Settings | File Templates.
 */
public class FileInputSplitter
{
    private int quantity;
    private String itemName;
    private double price;
    private boolean isImported;

    ReadFile reader = new ReadFile();
    private final ItemNameGenerator itemNameGenerator = new ItemNameGenerator();
    RoundValueGenerator rounder = new RoundValueGenerator();
    Item item;

    public double totalTaxOfAllItems = 0.0;
    public double totalCostOfAllItems = 0.0;


    public void splitItemListFromFile(String fileName) throws IOException, WrongInputException {
        ArrayList<String> itemsList = reader.readFileOfItems(fileName);
        for(String line : itemsList)
        {
            String[] result = line.split(" ");
            quantity = Integer.parseInt(result[0]);
            itemName = itemNameGenerator.findItem(line);
            price = Double.parseDouble(result[result.length - 1]);

            createItemObjects(line);
        }

        System.out.println("total tax is :" + rounder.roundToTwoDecimalPlaces(totalTaxOfAllItems));
        System.out.println("total cost is :"+ rounder.roundToTwoDecimalPlaces(totalCostOfAllItems));
    }

    private void createItemObjects(String line) throws WrongInputException
    {
        boolean isImportedOrNot;
        if(!(itemName.contains("book")||itemName.contains("pills")||itemName.contains("chocolate")))
        {
            isImportedOrNot = ImportedOrNot.isImported(itemName);
            item = new TaxableItem(itemName, price, quantity, isImportedOrNot);
            taxAndCostCalculator(line, item);

        }
        else
        {
            isImportedOrNot = ImportedOrNot.isImported(itemName);
            item = new NonTaxableItem(itemName, price, quantity, isImportedOrNot);
            taxAndCostCalculator(line, item);
        }
    }

    private void taxAndCostCalculator(String line, Item item) {
        System.out.println(line + " will cost -: " + item.calculateTotalCostAfterTax());
        totalTaxOfAllItems += item.calculateTax();
        totalCostOfAllItems += item.calculateTotalCostAfterTax();
    }

//    private String findItem(String line) {
//        return itemNameGenerator.findItem(line);
//    }
}
