package doc_ghi_theo_kieu_dl;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class GhiDuLieu {
    public static void main(String[] args) {
        String name = "Nguyễn Văn Bình";
        int age = 20;
        SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
        Date birthday = null;
        try {
            birthday = sf.parse("21/12/2002");
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
        String address = "Hà Nam";
        String className = "JV240408";

        DataOutputStream ghi = null;

        try {
            ghi = new DataOutputStream(new FileOutputStream("src/data/sinhvien.txt"));
            ghi.writeUTF(name);
            ghi.writeInt(age);
            ghi.writeUTF(sf.format(birthday));
            ghi.writeUTF(address);
            ghi.writeUTF(className);
            System.out.println("Da ghi du lieu xuong file");
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.out.println("Co loi xay ra: "+e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                ghi.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
