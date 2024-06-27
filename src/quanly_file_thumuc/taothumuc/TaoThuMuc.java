package quanly_file_thumuc.taothumuc;

import java.io.File;

public class TaoThuMuc {
    public static void main(String[] args) {
        File f = new File("D:/Data_thu_muc_moi");
        if(!f.exists()){
            final boolean blCreated = f.mkdir();
            if(blCreated){
                System.out.println("Da tao thu muc");
            }else{
                System.out.println("Khong tao duoc thu muc");
            }

        }else{
            System.out.println("Thu muc da ton tai o duong dan: "+f.getAbsolutePath());
            if(f.getName().startsWith("Data")){
                System.out.println("Khong duoc xoa cac thu muc bat dau voi Data...");
            }else {
                final boolean blDeleted = f.delete();
                if (blDeleted)
                    System.out.println("Da xoa thu muc " + f.getName());
                else
                    System.out.println("Khong xoa duoc thu muc: " + f.getName());
            }

        }
    }
}
