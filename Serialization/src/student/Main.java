package student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeToFile(String path, List<Student> students) throws IOException {
        try{
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            oos.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws IOException {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Lý Thanh Tùng", "Thừa Thiên Huế"));
        students.add(new Student(2,"Nguyễn Văn A", "Thừa Thiên Huế"));
        students.add(new Student(3,"Nguyễn Văn B", "Thừa Thiên Huế"));
        students.add(new Student(4,"Nguyễn Văn C", "Thừa Thiên Huế"));
        students.add(new Student(5,"Nguyễn Văn D", "Thừa Thiên Huế"));
        students.add(new Student(6,"Nguyễn Văn E", "Thừa Thiên Huế"));
        writeToFile("E:\\GitHub\\JavaBasic\\Serialization\\src\\student\\student.data",students);
        List<Student> studentDataFromFile = readDataFromFile("E:\\GitHub\\JavaBasic\\Serialization\\src\\student\\student.data");
        for (Student student: studentDataFromFile){
            System.out.println(student);
        }
    }

    public static List<Student> readDataFromFile(String path){
        List<Student> students = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return students;
    }
}
