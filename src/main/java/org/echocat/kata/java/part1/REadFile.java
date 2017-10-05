package org.echocat.kata.java.part1;

/**
 * Created by naydenganchev on 01/06/2017.
 */
//import libraries
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//creating the Class
public class REadFile {

    public static void main(String args[]) throws FileNotFoundException {

        //creating File instance to reference text file from a folder
        File dir = new File("/Users/naydenganchev/Downloads/java-kata-1/src/main/resources/org/echocat/kata/java/part1/data");

        for (File file : dir.listFiles()){ //looping through the files in the folder
            //Creating Scanner instnace to read File
            Scanner scnr = new Scanner(file);
            //Reading each line of files
            int lineNumber = 1;
            while(scnr.hasNextLine()){
                String line = scnr.nextLine();
                System.out.println(line);
                lineNumber++;
        }



        }

    }


}

