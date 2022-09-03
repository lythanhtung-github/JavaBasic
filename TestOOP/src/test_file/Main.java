package test_file;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file1 = new File("E:\\GitHub\\JavaBasic\\TestOOP\\FileTest1.txt");
        try {
            if (file1.exists()){
                System.out.println("Tập tin đã tồn tại");
            }
            else{
                System.out.println("Tạo file thành công");
                file1.createNewFile();
            }
            //Không có quyền tạo tập tin
            //Ổ cứng bị đầy
            //Đường dẫn sai

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
