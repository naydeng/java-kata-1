package org.echocat.kata.java.part1;

/**
 * Created by naydenganchev on 01/06/2017.
 */
//import libraries
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//Create the class
public class FindAnElement {
    public static void main(String args[]) throws FileNotFoundException {
        //Choosing the file which will be checked
        File file = new File("/Users/naydenganchev/Downloads/java-kata-1/src/main/resources/org/echocat/kata/java/part1/data/books.csv");

        try {
            Scanner scanner = new Scanner(file);

            //now read the file line by line...
            int lineNum = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                lineNum++;
                String isbn = "5554-5545-4518";
                if (line.contains(isbn)) {
                    System.out.println("This isbn belongs to: " + line);
                }
            }
        } catch (FileNotFoundException e) {
        }
    }
}