package test;

import main.ReadFile;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

/**
* Created by IntelliJ IDEA.
* User: rajashre
* Date: 7/9/11
* Time: 9:24 PM
* To change this template use File | Settings | File Templates.
*/
public class TestReadFile {
    @Test
    public void itemDotTxtFileContainsStringItem() throws Exception
    {
           ReadFile reader = new ReadFile();
           ArrayList<String> listOfItems = reader.readFileOfItems("Item.txt");
           String firstItem = listOfItems.get(0);
           assertThat(firstItem, containsString("item"));
    }

}
