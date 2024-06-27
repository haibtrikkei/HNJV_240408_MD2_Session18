package doc_ghi_danh_sach;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class GhiDanhSach {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            list.add(new Student("s01","Nguyễn Mạnh Cươờng",true,sf.parse("12/05/2000"),"Đại Từ - Thái Nguyên","JV240408"));
            list.add(new Student("s02","Phạm Lan Anh",false,sf.parse("22/07/2001"),"Phổ Yên - Thái Nguyên","JV240408"));
            list.add(new Student("s03","Đinh Tiến Mạnh",true,sf.parse("11/03/2000"),"Sóc Sơn - Hà Nội","JV240408"));
            list.add(new Student("s04","Nguyễn Đức Nam",true,sf.parse("25/07/2001"),"Đại Từ - Thái Nguyên","JV240408"));
            list.add(new Student("s05","Nguyễn Thị Huyền",true,sf.parse("16/10/2000"),"Hà Đông - Hà Nội","JV240408"));
            list.add(new Student("s06","Nguyễn Tiến Dũng",true,sf.parse("03/05/2002"),"Đại Từ - Thái Nguyên","JV240408"));
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }

        //ghi file
        ObjectOutputStream write = null;

        try {
//            write = new ObjectOutputStream(new FileOutputStream("src/data/list_students.txt", true));  // ghi tiep du lieu vao file
            write = new ObjectOutputStream(new FileOutputStream("src/data/list_students.txt"));  // mac dinh la ghi de
            write.writeObject(list);
            System.out.println("Da ghi danh sach xuong file");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }finally {
            try {
                write.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
