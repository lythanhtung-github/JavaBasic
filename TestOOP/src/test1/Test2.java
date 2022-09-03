package test1;

import java.io.File;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        File f = new File("E:\\GitHub\\JavaBasic\\TestOOP\\Books\\test2.txt");
        File dir = new File("Books");
        dir.mkdir();
        if (dir.isDirectory()) {
            String[] dirContents = dir.list();
            for (int i = 0; i < dirContents.length; i++)
                System.out.println(dirContents[i]);
        }

        System.out.println(dir.getAbsolutePath());
        File file = null;
        try {
            file = new File("E:\\GitHub\\JavaBasic\\TestOOP\\Books\\test.txt");
            boolean isCreat = file.createNewFile();
            if (isCreat)
                System.out.print("Da tao file thanh cong!");
            else
                System.out.print("Tao file that bai");
            //file.delete();
        } catch (Exception e) {
            System.out.print(e);
        }
        file.delete();

//        boolean isDeleted = f.delete();
    }
}
