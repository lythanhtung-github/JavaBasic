package copyfile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    private static final List<String> strArray = new ArrayList<>();

    private static void readFile(String filePath) {

        try {
            FileReader file = new FileReader(filePath);

            BufferedReader br = new BufferedReader(file);
            while ((br.readLine()) != null) {
                strArray.add(br.readLine());
            }
            br.close();
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
    }

    private static void writeFile(String filePathCopy) {
        try {
            FileWriter writer = new FileWriter(filePathCopy);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (String str : strArray) {
                bufferedWriter.write(str + "\n");
            }
            bufferedWriter.close();
            System.out.println("Copy file thành công");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private CopyFile() {
    }

    public static void copyFile(String filePath, String filePathCopy) {
        readFile(filePath);
        writeFile(filePathCopy);
    }

}
