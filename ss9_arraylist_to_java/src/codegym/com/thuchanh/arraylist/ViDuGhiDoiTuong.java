package codegym.com.thuchanh.arraylist;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ViDuGhiDoiTuong {
    public static void main(String[] args) {
        try {


            File file = new File("D:\\CodeGym\\module2\\ss9_arraylist_to_java\\src\\codegym\\com\\thuchanh\\arraylist\\file.txt");
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            Students student= new Students("001","Bao",2000,8);
            oos.writeObject(student);
            oos.flush(); // flush là đẩy dữ liệu đi
            oos.close();
        }catch (Exception e){

        }
    }
}
