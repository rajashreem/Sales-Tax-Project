package main;

import java.io.IOException;

/**
* Created by IntelliJ IDEA.
* User: rajashre
* Date: 7/8/11
* Time: 3:11 PM
* To change this template use File | Settings | File Templates.
*/
public class Application {
    public static void main(String[] args) throws WrongInputException, IOException {
        FileInputSplitter i = new FileInputSplitter();
        i.splitItemListFromFile("ItemList.txt");
    }
}
