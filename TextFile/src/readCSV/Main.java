package readCSV;

import com.sun.corba.se.impl.logging.InterceptorsSystemException;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader br = null;
        try {
            String line;
            fr = new FileReader("E:\\GitHub\\JavaBasic\\TextFile\\src\\readCSV\\contries.csv");
            //"E:\\GitHub\\JavaBasic\\TextFile\\src\\readCSV\\contries.csv"
            br = new BufferedReader(fr);
            while ((br.readLine()) != null) {
                line = br.readLine();
                printCountry(parseCsvLine(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> parseCsvLine(String csvLine) {
        List<String> result = new ArrayList<>();
        if (csvLine != null) {
            String[] splitData = csvLine.split(",");
            result.addAll(Arrays.asList(splitData));
            // Collections.addAll(result, splitData);
        }
        return result;
    }

    private static void printCountry(List<String> country) {
        System.out.println(
                "Country [id= "
                        + country.get(0)
                        + ", code= " + country.get(1)
                        + " , name=" + country.get(2)
                        + "]");
//        new Country(Integer.parseInt(country.get(0)), country.get(1), country.get(2));
    }
}
