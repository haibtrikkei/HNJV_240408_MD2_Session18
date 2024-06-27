package doc_ghi_danh_sach;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QuanLySinhVien {
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

        String fileName = "list_new_students.txt";
        final boolean blCreated = StudentFileService.writeToFile(fileName, list);
        if(blCreated){
            System.out.println("Da ghi danh sach sinh vien vao file: "+fileName);
        }else{
            System.out.println("Khong ghi duoc danh sach xuong file");
        }

        List<Student> listRead = StudentFileService.readFromFile(fileName);
        System.out.println("Du lieu doc duoc: ");
        for(Student s : listRead){
            System.out.println(s.toString());
        }

        listRead.add(new Student("s10","Lê Đức Lâm",true,new Date(),"Hà Nam","JV240612"));
        final boolean blCreatedNew = StudentFileService.writeToFile(fileName, listRead);
        if(blCreatedNew){
            System.out.println("Da ghi them sinh vien vao file: "+fileName);
        }else{
            System.out.println("Khong ghi duoc danh sach xuong file");
        }
    }
}
