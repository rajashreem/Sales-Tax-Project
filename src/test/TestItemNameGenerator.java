package test;

import main.ItemNameGenerator;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by IntelliJ IDEA.
 * User: rajashre
 * Date: 7/10/11
 * Time: 1:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestItemNameGenerator {
    @Test
    public void oneBookOfHarryPotterAt15Point00ContainsItemNameOneBookOfHarryPotter()
    {
        assertThat("book of Harry Potter ", is(new ItemNameGenerator().findItem("1 book of Harry Potter at 15.00")));
    }


    @Test
    public void oneBookAt15Point00ContainsItemNameBook()
    {
        assertThat("book ", is(new ItemNameGenerator().findItem("1 book at 15.00")));
    }
}
