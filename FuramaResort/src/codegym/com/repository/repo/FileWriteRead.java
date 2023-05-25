package codegym.com.repository.repo;

import codegym.com.model.person.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileWriteRead {
    public  void writeToOne(List<Employee> list) {
        try {
            java.io.FileWriter fw = new java.io.FileWriter("employee.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            for (Employee employee : list) {
                bw.write(employee.toString());
                bw.newLine();
                bw.flush();
            }

            fw.close();
            bw.close();
        } catch (IOException e) {

        }

    }
    public static List<Employee> readFromFile(){
         List<Employee> employees = new ArrayList<>();
        try{

            FileReader fr = new FileReader("employee.txt");
            BufferedReader br = new BufferedReader(fr);
            String line ="";
            while (true){
                line = br.readLine();
                if(line == null){
                    break;
                }
                String[] txt = line.split(" - ");
                String id = txt[0];
                String name = txt[1];
                int age = Integer.parseInt(txt[2]);
                String address = txt[3];
                String phone = txt[4];
                String gender = txt[5];
                String email = txt[6];
                double salary = Double.parseDouble(txt[7]);
                String position = txt[8];
                String education= txt[9];
                employees.add(new Employee(id,name,age,address,phone,gender,email,salary,position,education));
            }
        }catch (IOException e){

        }
        return employees;
    }

    public  void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee epl = new Employee("E01","bao",20,"11/9 đỗ quang","0905867399","Nam","bao@gmail.com",20000,"giám đốc","đại học");
        Employee epl1 = new Employee("E02","anh",21,"20 đỗ quang","0905867399","Nữ","anh@gmail.com",50000,"bao vệ","cấp 3");
        Employee epl2 = new Employee("E03","hung",22,"hà nội","0379122230","Nam","hung@gmail.com",50000,"chủ tich","cấp 3");
        Employee epl3 = new Employee("E04","trung",23," ninh bình","0905867399","Nữ","trunggmail.com",50000,"đầu bếp","cấp 3");

        list.add(epl);
        list.add(epl1);
        list.add(epl2);
        list.add(epl3);
        FileWriteRead fileWriteRead = new FileWriteRead();
        fileWriteRead.writeToOne(list);
        fileWriteRead.readFromFile();



    }
}