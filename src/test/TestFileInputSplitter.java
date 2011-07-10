package test;

import main.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.IOException;
import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

/**
* Created by IntelliJ IDEA.
* User: rajashre
* Date: 7/10/11
* Time: 10:18 AM
* To change this template use File | Settings | File Templates.
*/

@RunWith(MockitoJUnitRunner.class)
public class TestFileInputSplitter
{
    @Mock
        private ReadFile reader;

    @Mock
    private ItemNameGenerator itemName;

    @Mock
    private RoundValueGenerator rounder;

    @Mock
    private Item item;



    @Test
    public void costOfMusicCDWith14Point99ShouldBe16point49AfterTax() throws IOException, WrongInputException {
        ArrayList<String> input = new ArrayList<String>();
        String inputLine = "1 music cd at 14.99";
        input.add(inputLine);

        String fileName = "FakeItem.txt";
        when(reader.readFileOfItems(fileName)).thenReturn(input);
        when(itemName.findItem(inputLine)).thenReturn("music cd");
        when(item.calculateTotalCostAfterTax()).thenReturn(16.99);
        when(item.calculateTax()).thenReturn(1.5);


        FileInputSplitter splitter = new FileInputSplitter();
        splitter.splitItemListFromFile(fileName);
        assertThat(1.5 ,is(splitter.totalTaxOfAllItems));
        assertThat(16.49 ,is(splitter.totalCostOfAllItems));

    }
}
