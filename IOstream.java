package OctArch;

import java.io.*;
import java.net.*;
import java.net.URL;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IOstream {

    public static String readTestResults(String s)  {
        String result = "";
        File file = new File("src/resources/result");

        try{
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()){
                result += scan.nextLine();
            }

            System.out.println(result);
            return result;
        }

        catch (FileNotFoundException e) {
            return "";
        }
    }

}