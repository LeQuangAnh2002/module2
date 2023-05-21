package codegym.com.demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileWriter {
    public void writeToOne(List<Student> list){
        try {

            java.io.FileWriter fw= new java.io.FileWriter("data.txt");
            // dùng contructor append: true để ghi đè dữ liệu mà ko phải xoá dữ liệu củ.
            // sử dụng FileWriter mặc định sẽ xóa dữ liệu cũ và add dữ liệu mới vào.
            BufferedWriter bw = new BufferedWriter(fw);
            // dùng for để duyệt toàn bộ mảng arr
            for (Student o: list){
                bw.write(o.toString());
                bw.newLine();
            }
            bw.close();
            fw.close();
        }catch (IOException e){

        }

    }
    public List<Student> readFromFile(){
        List<Student> list  = new ArrayList<>();
        try {
            FileReader fr = new FileReader("data.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = "";

            while (true){
                line = br.readLine();
                if(line == null) {
                    break;
                }
                String[] txt = line.split(";");
                String name = txt[0];
                int age = Integer.parseInt(txt[1]);
                double mark = Double.parseDouble(txt[2]);
                list.add(new Student(name,age,mark));

            }


        }catch (IOException e){

        }
        return  list;
    }

    public static void main(String[] args) {
        FileWriter fileWriter = new FileWriter();
        List<Student> list = new ArrayList<>();
        Student s6 = new Student("lê van nam", 25,8.7);
        Student s7 = new Student("lê van bao", 21,8.3);
        Student s8 = new Student("lê van hung", 21,2.3);
        list.add(s6);
        list.add(s7);
        list.add(s8);
        fileWriter.writeToOne(list);


    }

}
