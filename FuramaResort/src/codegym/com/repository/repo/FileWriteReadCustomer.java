package codegym.com.repository.repo;

import codegym.com.model.person.Customer;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class FileWriteReadCustomer {
    public void writeToOne(List<Customer> list){
      try{
          FileWriter fileWriter = new FileWriter("customer.txt");
          BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
          for (Customer customer: list){
              bufferedWriter.write(customer.toString());
              bufferedWriter.flush();
              bufferedWriter.newLine();
          }
          fileWriter.close();
          bufferedWriter.close();
      } catch (IOException e){

      }
    }
    public  List<Customer> readToOne(){
        List<Customer> customerList = new LinkedList<>();
        try{
            FileReader fileReader = new FileReader("customer.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while (true){
                line = bufferedReader.readLine();
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
                String ngaySinh = txt[7];
                String soCMND = txt[8];
                String loaiKhach = txt[9];
                customerList.add(new Customer(id,name,age,address,phone,gender,email,ngaySinh,soCMND,loaiKhach));

            }
        }catch (IOException e){

        }
        return customerList;
    }
    public static void main(String[] args) {
        List<Customer> customerList = new LinkedList<>();
        Customer customer = new Customer("Kh01","yen",20,"ha noi","0905869396","Nữ","yenxinh@gmail.com","22-02-1999","198396797","PR0");
        Customer customer1 = new Customer("Kh02","nhung",21,"HCM","0921321393","Nữ","nhung@gmail.com","22-02-2000","195495347","PR0");
        Customer customer2 = new Customer("Kh03","hoang",22,"nha trang","0213213244","Nam","hoang@gmail.com","22-22-2012","197396595","PR0");
        Customer customer3 = new Customer("Kh04","hung",25,"ninh binh","04214214125","Nam","hung@gmail.com","22-09-1988","19734123","PR0");
        customerList.add(customer);
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        FileWriteReadCustomer fileWriteReadCustomer = new FileWriteReadCustomer();

        fileWriteReadCustomer.writeToOne(customerList);
        fileWriteReadCustomer.readToOne();

    }
}
