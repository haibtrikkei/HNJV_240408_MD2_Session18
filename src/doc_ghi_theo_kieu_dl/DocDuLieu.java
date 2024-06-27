package doc_ghi_theo_kieu_dl;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DocDuLieu {
    public static void main(String[] args) {
        DataInputStream read;
        String name = "";
        int age = 0;
        Date birthday = null;
        String address = "";
        String className = "";
        SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            read = new DataInputStream(new FileInputStream("src/data/sinhvien.txt"));
            name = read.readUTF();
            age = read.readInt();
            birthday = sf.parse(read.readUTF());
            address = read.readUTF();
            className = read.readUTF();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Ho ten: "+name);
        System.out.println("Tuoi :"+age);
        System.out.println("Ngay sinh: "+sf.format(birthday));
        System.out.println("Que quan: "+address);
        System.out.println("Lop hoc: "+className);
    }
}
