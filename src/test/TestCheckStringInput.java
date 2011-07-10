package test;

import main.CheckStringInput;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * User: rajashre
 * Date: 7/10/11
 * Time: 1:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestCheckStringInput {
    @Test
    public void rajashreeIsNotNull()
    {
        assertEquals(false , CheckStringInput.isStringEmpty("rajashree"));
    }

    @Test
    public void nullIsNull()
    {
        assertEquals(true , CheckStringInput.isStringEmpty(""));
    }
}
