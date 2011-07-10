package test.java;

import cuke4duke.annotation.I18n.EN.Given;
import cuke4duke.annotation.I18n.EN.Then;
import main.FileInputSplitter;
import main.WrongInputException;

import java.io.IOException;

import static junit.framework.Assert.assertEquals;

@SuppressWarnings({"UnusedDeclaration"})
public class TaxFeature {
    private String fileName;
    private double expectedTax;
    private double expectedCost;

    @Given("^The File is ([A-z]*)$")
    public void theFileNameIs(String fileName) {
        this.fileName = fileName+".txt";
    }

    @Then("^The Tax is ([^\"]*)$")
    public void theTaxIs(String tax) throws WrongInputException, IOException {
        expectedTax = Double.parseDouble(tax);
        FileInputSplitter splitter = new FileInputSplitter();
        splitter.splitItemListFromFile(fileName);

        assertEquals(expectedTax, splitter.totalTaxOfAllItems);
    }

    @Then("^The Total Cost will be ([^\"]*)$")
    public void theCostIs(String cost) throws WrongInputException, IOException {
        expectedCost = Double.parseDouble(cost);
        FileInputSplitter splitter = new FileInputSplitter();
        splitter.splitItemListFromFile(fileName);

        assertEquals(expectedCost, splitter.totalCostOfAllItems);
    }
}


