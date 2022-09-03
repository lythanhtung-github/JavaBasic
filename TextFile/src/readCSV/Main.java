package readCSV;

import com.sun.corba.se.impl.logging.InterceptorsSystemException;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            String line;
            //"E:\\GitHub\\JavaBasic\\TextFile\\src\\readCSV\\contries.csv"
            br = new BufferedReader(
                    new FileReader("E:\\GitHub\\JavaBasic\\TextFile\\src\\readCSV\\contries.csv"));
            while ((line = br.readLine()) != null) {
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
        int id;
        String vietTat;
        String name;
        List<String> result = new ArrayList<>();
        if (csvLine != null) {
            String[] splitData = csvLine.split(",");
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
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
