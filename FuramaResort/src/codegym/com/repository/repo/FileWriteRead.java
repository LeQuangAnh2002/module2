package codegym.com.repository.repo;

import codegym.com.model.person.Employee;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileWriteRead {
    public void writeToOne() {
        List<Employee> list = new ArrayList<>();
        Employee epl = new Employee("kh01","bao",20,"11/9 đỗ quang","0905867399",true,"bao@gmail.com",20000,"giám đốc","đại học");
        Employee epl1 = new Employee("kh02","anh",21,"20 đỗ quang","0905867399",false,"anh@gmail.com",50000,"bao vệ","cấp 3");

        list.add(epl);
        list.add(epl1);
        try {
            java.io.FileWriter fw = new java.io.FileWriter("employee.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            for (Employee employee : list) {
                bw.write(employee.toString());
                bw.newLine();
            }
            fw.close();
            bw.close();
        } catch (IOException e) {

        }

    }

    public static void main(String[] args) {

        FileWriteRead fileWriteRead = new FileWriteRead();
        fileWriteRead.writeToOne();



    }
}