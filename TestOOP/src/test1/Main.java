package test1;

import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        String toSplit = "50,20,Huong,Thien,20";
        String[] results = toSplit.split(",");
        for (String element : results) {
            System.out.println(element);
        }

        java.io.File file = new java.io.File("scores.txt");
        if (file.exists()) {
            System.out.println("File already exists");

            System.exit(1);
        }
        // Create a file
        java.io.PrintWriter output = new java.io.PrintWriter(file);
        // Write formatted output to the file
        output.print("John T Smith ");
        output.println(90);
        output.print("Eric K Jones ");
        output.println(85);
        // Close the file
        output.close();
    }
}
