package main;

/**
 * Created by IntelliJ IDEA.
 * User: rajashre
 * Date: 7/10/11
 * Time: 12:40 AM
 * To change this template use File | Settings | File Templates.
 */
public class ImportedOrNot {
    public boolean isImported (String itemName)
    {
        return itemName.contains("import");
    }

}
