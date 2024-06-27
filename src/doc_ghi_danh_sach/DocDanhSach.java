package doc_ghi_danh_sach;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class DocDanhSach {
    public static void main(String[] args) {
        List<Student> list = null;

        ObjectInputStream read = null;

        try {
            read = new ObjectInputStream(new FileInputStream("src/data/list_students.txt"));
            list = (List<Student>) read.readObject();
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

        System.out.println("Danh sach sinh vien: ");
        for(Student s: list){
            System.out.println(s.toString());
        }


    }
}
