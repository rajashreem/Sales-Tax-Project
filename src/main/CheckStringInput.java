package main;

/**
 * Created by IntelliJ IDEA.
 * User: rajashre
 * Date: 7/9/11
 * Time: 5:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class CheckStringInput {
    //private static boolean inputResult = true;
    public static boolean isStringEmpty(String input)
    {
        return input == null || input.length() == 0;
//    {
//         if(input == null || input.length()==0)
//             inputResult = false;
//         return inputResult;
    }

}
