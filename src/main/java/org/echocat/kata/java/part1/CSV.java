import java.io.*;
import java.util.Arrays;

public class CSV {
    public static void main(String[] args) throws IOException {
        try (BufferedReader CSVFile = new BufferedReader(new FileReader("/Users/naydenganchev/Downloads/java-kata-1/src/main/resources/org/echocat/kata/java/part1/data/books.csv"))) {
            String[] dataArray = null;
            String data = CSVFile.readLine(); // Read first line.

            while (data != null) {
                //data = data.replace(",00", ".00");
                dataArray = data.split(";"); //split on the comma only if that comma has zero, or an even number of quotes in ahead of it.
                Arrays.sort(dataArray);
                System.out.print(dataArray[0]);
                System.out.println(); // Print the data line.
                data = CSVFile.readLine(); // Read next line of data.
            }
        }


        System.out.println();  // End the printout with a blank line.

    }
}