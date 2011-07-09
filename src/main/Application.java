package main;

/**
 * Created by IntelliJ IDEA.
 * User: rajashre
 * Date: 7/8/11
 * Time: 3:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class Application {
    public static void main(String[] args)
    {
        Item item = new Item();
        RoundValueGenerator round = new RoundValueGenerator();
        double finalCost = 0.0;
        finalCost = item.calculateCostAfterTax("imported_chocolate", 1, 11.25);
        System.out.println("\ncost after tax is :"+finalCost);
    }
}
