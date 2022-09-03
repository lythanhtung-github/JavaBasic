package copyfile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    private List<String> strArray = new ArrayList<>();
    public void readFile(String filePath){

        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                strArray.add(line);
            }
            br.close();
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
    }

    public void writeFile(String filePathCopy){
        try {
            FileWriter writer = new FileWriter(filePathCopy, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for(String str : strArray){
                bufferedWriter.write(str+"\n");
            }
            bufferedWriter.close();
            System.out.println("Copy file thành công");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public CopyFile(String filePath, String filePathCopy) {
        readFile(filePath);
        writeFile(filePathCopy);
    }

}
