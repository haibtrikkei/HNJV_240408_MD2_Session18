package doc_file_thu_muc_windows;

import java.io.File;

public class DocFileVaThuMuc {
    public void readFileAndDirectory(String indent, String path) {
        File f = new File(path);
        System.out.println(indent+f.getName());
        final File[] liFiles = f.listFiles();
        if (liFiles != null)
            for (File fi : liFiles) {
                readFileAndDirectory(indent + "\t", fi.getAbsolutePath());
            }
    }

}
