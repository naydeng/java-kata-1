package org.echocat.kata.java.part1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by naydenganchev on 01/06/2017.
 */
public class FindAnAutor {

    //Create the class
    public class FindAnElement {
        public void main(String args[]) throws FileNotFoundException {
            //Choosing the file which will be checked
            File dir = new File("/Users/naydenganchev/Downloads/java-kata-1/src/main/resources/org/echocat/kata/java/part1/data");
            for (File file : dir.listFiles()) { //looping through the files in the folder
                //Creating Scanner instnace to read File
                Scanner scnr = new Scanner(file);

                try {
                    Scanner scanner = new Scanner(dir);

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
    }
}