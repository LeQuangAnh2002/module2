package codegym.com.baitap;

import java.io.*;

public class DocFileCSV {
    public static void main(String[] args) {
        String csvFile = "D:\\CodeGym\\module2\\ss16_text_file_to_java\\abc.csv";
        File file = new File(csvFile);
        String line = "";
        try(BufferedReader br = new BufferedReader(new FileReader(csvFile))){
            while ((line = br.readLine()) != null && !line.isEmpty()){
                String fields[] = line.split(",");
                System.out.println(fields[0] );
            }
        }catch( FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }


}
