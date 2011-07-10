package main;

public class ItemNameGenerator {
    public ItemNameGenerator() {
    }

    public String findItem(String line) {
        String itemName = "";
        String[] result = line.split(" ");
        for (int i = 1; i < (result.length - 2); i++)
            itemName += result[i] + " ";
        return itemName;
    }
}