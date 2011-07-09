package test;

import main.TaxableItem;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by IntelliJ IDEA.
 * User: rajashre
 * Date: 7/9/11
 * Time: 6:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestTaxableItem {
    @Test
       public void costOfMusicCdWithPriceFourteenPointNinetyNineIsSixteenPointFortyNine() throws Exception
       {
           assertEquals(16.49,new TaxableItem("music_CD", 14.99, 1, false).calculateTotalCostAfterTax());
       }

       @Test
       public void costOfPerfumeWithPriceEighteenPointNinetyNineIsTwentyPointEightNine() throws Exception
       {
           assertThat(20.89, is(new TaxableItem("perfume", 18.99, 1, false).calculateTotalCostAfterTax()));
       }

       @Test
       public void costOfImportedMusicCDWithPriceHundredIsHundredAndFifteen() throws Exception
       {
           assertEquals(115.0,new TaxableItem("imported_music_CD", 100.0, 1, true).calculateTotalCostAfterTax());
       }

       @Test
       public void costOfTwoImportedMusicCDsWithPriceHundredIsTwuHundredAndThirty() throws Exception
       {
           assertEquals(230.0,new TaxableItem("imported_music_CD", 100.0, 2, true).calculateTotalCostAfterTax());
       }

       @Test
       public void costOfImportedBottleOfPerfumeWithPriceFortySevenPointFiveZeroIsFiftyFourPointSixtyFive() throws Exception
       {
           assertEquals(54.65,new TaxableItem("imported_perfume", 47.5, 1, true).calculateTotalCostAfterTax());
       }


}
