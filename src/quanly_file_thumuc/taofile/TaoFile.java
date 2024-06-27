package quanly_file_thumuc.taofile;

import java.io.File;
import java.io.IOException;

public class TaoFile {
    public static void main(String[] args) {
        File f = new File("D:\\My_data/file1.txt");
        if(f.exists()){
            System.out.println(f.getName()+" da ton tai");
            System.out.println("Duong dan tuyet doi: "+f.getAbsolutePath());
        }else{
            try {
                 boolean blCreated = f.createNewFile();
                 if(blCreated){
                     System.out.println("Da tao file "+f.getName());
                 }else{
                     System.out.println("Khong tao duoc file "+f.getName());
                 }
            } catch (IOException e) {
                System.out.println("Khong tao duoc file: "+e.getMessage());
            }
        }
    }
}
