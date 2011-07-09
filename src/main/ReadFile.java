package main;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: rajashre
 * Date: 7/9/11
 * Time: 7:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class ReadFile {

    private ArrayList<String> fileInputs = new ArrayList<String>();

    public ArrayList<String> readFileOfItems(String file) throws IOException {
        try
        {
            File itemFile = new File(file);
            FileReader fileReader = new FileReader(itemFile);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = null;
            while((line = reader.readLine()) != null)
            {
                   fileInputs.add(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return fileInputs;

    }

}

