package main;

import sun.reflect.generics.tree.ReturnType;

import java.io.DataOutput;
import java.text.DecimalFormat;

/**
 * Created by IntelliJ IDEA.
 * User: rajashre
 * Date: 7/8/11
 * Time: 11:06 AM
 * To change this template use File | Settings | File Templates.
 */
public class RoundValueGenerator {
    public double roundToNearestDecimalFive(Double number)
    {
        int temporaryNumber = (int)(roundToTwoDecimalPlaces(number)*100);
        int unitPlace = temporaryNumber % 10;
        if (unitPlace > 5)
        {
            temporaryNumber += (10 - unitPlace);
        }
        else
        {
            temporaryNumber += (5 - unitPlace);
        }
        double finalRoundedValue = temporaryNumber /100.0;
        return finalRoundedValue;

    }

    public double roundToTwoDecimalPlaces(double numberToRound)
    {
        int resultantInt = (int)(numberToRound * 100);
        double resultantDouble = ((double )resultantInt)/100.0;
        return resultantDouble;
    }
}
