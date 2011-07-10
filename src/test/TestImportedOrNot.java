package test;

import main.ImportedOrNot;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 * Created by IntelliJ IDEA.
 * User: rajashre
 * Date: 7/10/11
 * Time: 1:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestImportedOrNot {
    @Test
    public void importedChocolateIsImported() throws Exception
    {
        assertTrue("true" , ImportedOrNot.isImported("imported_chocolate"));
    }

    @Test
    public void bookIsNotImported() throws Exception
    {
        assertEquals(false, ImportedOrNot.isImported("book"));
    }

}
