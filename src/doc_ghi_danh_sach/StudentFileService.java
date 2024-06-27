package doc_ghi_danh_sach;

import java.io.*;
import java.util.List;

public class StudentFileService {
    public static boolean writeToFile(String fileName, List<Student> list){
        //ghi file
        ObjectOutputStream write = null;

        try {
            write = new ObjectOutputStream(new FileOutputStream("src/data/"+fileName));
            write.writeObject(list);
            return true;
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }finally {
            try {
                write.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        return false;
    }

    public static List<Student> readFromFile(String fileName){
        List<Student> list = null;

        ObjectInputStream read = null;

        try {
            read = new ObjectInputStream(new FileInputStream("src/data/"+fileName));
            list = (List<Student>) read.readObject();
            return list;
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                read.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        return null;
    }
}
