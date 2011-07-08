package test;

import main.RoundValueGenerator;
import org.testng.annotations.Test;
import junit.framework.Assert;
import static junit.framework.Assert.assertEquals;


/**
 * Created by IntelliJ IDEA.
 * User: rajashre
 * Date: 7/8/11
 * Time: 11:07 AM
 * To change this template use File | Settings | File Templates.
 */
public class TestRoundValueGenerator {
    @Test
    public void onePointFourNineNineAfterRoundingToTwoDecimalPlacesIsOnePointFourNine() throws Exception
    {
        assertEquals(1.49,new RoundValueGenerator().roundToTwoDecimalPlaces(1.499));
    }

    @Test
    public void twoPointThreeSevenEightAfterRoundingToTwoDecimalPlacesIsTwoPointThreeSeven() throws Exception
    {
        assertEquals(2.37,new RoundValueGenerator().roundToTwoDecimalPlaces(2.378));
    }

    @Test
    public void twoPointThreeSevenFiveAfterRoundingIsTwoPointForty() throws Exception
    {
        assertEquals(2.40,new RoundValueGenerator().roundToNearestDecimalFive(2.375));
    }

    @Test
    public void onePointNineNineAfterRoundingIsTwoPointZeroZero() throws Exception
    {
        assertEquals(2.00,new RoundValueGenerator().roundToNearestDecimalFive(1.99));
    }

    @Test
    public void onePointThreeTwoTwoAfterRoundingIsOnePointThirtyFive() throws Exception
    {
        assertEquals(1.35,new RoundValueGenerator().roundToNearestDecimalFive(1.322));
    }


}
