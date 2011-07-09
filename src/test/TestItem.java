//package test;
//
//import main.Item;
//import main.RoundValueGenerator;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.Mock;
//import org.mockito.runners.MockitoJUnitRunner;
//
//import static junit.framework.Assert.assertEquals;
//
///**
//* Created by IntelliJ IDEA.
//* User: rajashre
//* Date: 7/9/11
//* Time: 2:40 PM
//* To change this template use File | Settings | File Templates.
//*/
//@RunWith(MockitoJUnitRunner.class)
//public class TestItem {
//        @Mock
//            private RoundValueGenerator rounder;
//
//        @Test
//        public void costOfMusicCdWithPriceFourteenPointNinetyNineIsSixteenPointFortyNine() throws Exception
//        {
//                //when(rounder.roundToTwoDecimalPlaces(14.989)).thenReturn(14.99);
//               // when(rounder.roundToNearestDecimalFive(1.499)).thenReturn(1.50);
//                Item item = new Item();
//                assertEquals(16.49,item.calculateCostAfterTax("music_CD",1,14.99));
//        }
//
//}
