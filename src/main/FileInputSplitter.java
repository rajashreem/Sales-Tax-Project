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
    ImportedOrNot importStatus = new ImportedOrNot();
    Item item;


    private double totalTaxOfAllItems = 0.0;
    private double totalCostOfAllItems = 0.0;


    public void createItemListFromFile(String fileName) throws IOException, WrongInputException {
        ArrayList<String> itemsList = reader.readFileOfItems(fileName);
        for(String line : itemsList)
        {
            boolean isImported;
            String[] result = line.split(" ");
            int quantity = Integer.parseInt(result[0]);
            String itemName = itemNameGenerator.findItem(line);
            price = Double.parseDouble(result[result.length - 1]);

           // System.out.println("\n"+itemName+ "\n "+ price+ "\n "+ quantity);

            if(!(itemName.contains("book")||itemName.contains("pills")||itemName.contains("chocolate")))
            {
                isImported = importStatus.isImported(itemName);
                item = new TaxableItem(itemName, price, quantity, isImported);
                System.out.println(line + " will cost -: " + item.calculateTotalCostAfterTax());
                totalTaxOfAllItems += item.calculateTax();
                totalCostOfAllItems += item.calculateTotalCostAfterTax();

            }
            else
            {
                isImported = importStatus.isImported(itemName);
                item = new NonTaxableItem(itemName, price, quantity, isImported);
                System.out.println(line + " will cost -: " + item.calculateTotalCostAfterTax());
                totalTaxOfAllItems += item.calculateTax();
                totalCostOfAllItems += item.calculateTotalCostAfterTax();
            }
        }

        System.out.println("total tax is :" + rounder.roundToTwoDecimalPlaces(totalTaxOfAllItems));
        System.out.println("total cost is :"+ rounder.roundToTwoDecimalPlaces(totalCostOfAllItems));



    }


    private String findItem(String line) {
        return itemNameGenerator.findItem(line);
    }
}
