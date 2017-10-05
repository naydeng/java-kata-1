package org.echocat.kata.java.part1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read_Print_Data {

    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("Enter the path of your file: ");
        Scanner scann = new Scanner(System.in);
        String path = scann.nextLine();

        Scanner myFile = new Scanner(new File(path));
        myFile.useDelimiter(",");
        while(myFile.hasNext()){
            System.out.print(myFile.next().replace(";", "\n")+" ");
        }
        myFile.close();
    }
}
