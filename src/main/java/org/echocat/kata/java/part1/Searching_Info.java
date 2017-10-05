import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Searching_Info {
    public static void main(String args[]) throws FileNotFoundException {
        //Choosing the file which will be checked
        System.out.println("Enter the path of your file: ");
        Scanner scann = new Scanner(System.in);
        String path = scann.nextLine();

        Scanner myFile = new Scanner(new File(path));


        //now read the file line by line...
        System.out.println("You are looking for: ");
        String isbn = scann.nextLine();
        while (myFile.hasNextLine()) {
            String line = myFile.nextLine();

            if (line.contains(isbn)) {
                System.out.println("This isbn belongs to: " + line.replace(";", "\n"));
            }
        }
        myFile.close();
    }
}