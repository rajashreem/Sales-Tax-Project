package test;

import main.RoundValueGenerator;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

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
    public void onePointFourNineNineAfterRoundingToTwoDecimalPlacesIsOnePointFiveZero() throws Exception
    {
        assertEquals(1.50, roundToTwoDecimalPlaces(1.499));
    }

    @Test
    public void twoPointThreeSevenEightAfterRoundingToTwoDecimalPlacesIsTwoPointThreeEight() throws Exception
    {
        assertEquals(2.38,roundToTwoDecimalPlaces(2.378));
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
        assertThat(0.5, is(roundToNearestPointZeroFive(0.5)));
    }

    @Test
    public void zeroPointFiveFiveAfterRoundingIsZeroPointFiveFive() throws Exception
    {
        assertEquals(0.55,roundToNearestPointZeroFive(0.55));
    }

    private double roundToNearestPointZeroFive(double numberForRounding)
    {
        return new RoundValueGenerator().roundToNearestDecimalFive(numberForRounding);
    }

}
