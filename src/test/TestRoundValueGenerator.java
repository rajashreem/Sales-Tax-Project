package test;

import main.RoundValueGenerator;
import org.testng.annotations.Test;

import static junit.framework.Assert.assertEquals;


/**
 * Created by IntelliJ IDEA.
 * User: rajashre
 * Date: 7/8/11
 * Time: 11:07 AM
 * To change this template use File | Settings | File Templates.
 */
public class TestRoundValueGenerator {

    //Tests for roundToTwoDecimalPlaces
    @Test
    public void onePointFourNineNineAfterRoundingToTwoDecimalPlacesIsOnePointFourNine() throws Exception
    {
        assertEquals(1.49, roundToTwoDecimalPlaces(1.499));
    }

    @Test
    public void twoPointThreeSevenEightAfterRoundingToTwoDecimalPlacesIsTwoPointThreeSeven() throws Exception
    {
        assertEquals(2.37,roundToTwoDecimalPlaces(2.378));
    }

    private double roundToTwoDecimalPlaces(double numberToRound)
    {
        return new RoundValueGenerator().roundToTwoDecimalPlaces(numberToRound);
    }



    //tests for roundToNearestPointZeroFive
    @Test
    public void twoPointThreeSevenFiveAfterRoundingIsTwoPointForty() throws Exception
    {
        assertEquals(2.40, roundToNearestPointZeroFive(2.375));
    }

    private double roundToNearestPointZeroFive(double numberForRounding) {
        return new RoundValueGenerator().roundToNearestDecimalFive(numberForRounding);
    }

    @Test
    public void onePointNineNineAfterRoundingIsTwoPointZeroZero() throws Exception
    {
        assertEquals(2.00,roundToNearestPointZeroFive(1.99));
    }

    @Test
    public void onePointThreeTwoTwoAfterRoundingIsOnePointThirtyFive() throws Exception
    {
        assertEquals(1.35,roundToNearestPointZeroFive(1.322));
    }

    @Test
    public void onePointEightNineNineAfterRoundingIsOnePointNineZero() throws Exception
    {
        assertEquals(1.90,roundToNearestPointZeroFive(1.899));
    }

    @Test
    public void zeroPointFiveAfterRoundingIsZeroPointFive() throws Exception
    {
        assertEquals(0.5,roundToNearestPointZeroFive(0.5));
    }

    @Test
    public void zeroPointFiveFiveAfterRoundingIsZeroPointFiveFive() throws Exception
    {
        assertEquals(0.55,roundToNearestPointZeroFive(0.55));
    }
}
