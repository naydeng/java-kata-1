package org.echocat.kata.java.part1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadCSV_Scanner
{
    //Delimiters used in the CSV file
    private static final String DELIMITER = ";";

    public static void main(String args[])
    {

        Scanner scanner = null;
        try {
            //Get the scanner instance
            scanner = new Scanner(new File("/Users/naydenganchev/Downloads/java-kata-1/src/main/resources/org/echocat/kata/java/part1/data/books.csv"));
            //Use Delimiter
            scanner.useDelimiter(DELIMITER);
            while(scanner.hasNext())
            {
                System.out.print(scanner.next()+"   ");
            }
        }
        catch (FileNotFoundException fe)
        {
            fe.printStackTrace();
        }
        finally
        {
            scanner.close();
        }
    }
}