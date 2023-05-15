package codegym.com.baitap;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FileCopyText {
    public static void main(String[] args) {
        File sourceFile = new File("D:\\CodeGym\\module2\\ss16_text_file_to_java\\abc.txt");
        File destinationFile = new File("D:\\CodeGym\\module2\\ss16_text_file_to_java\\def.txt");
        try {
            Files.copy(sourceFile.toPath(),destinationFile.toPath());
            System.out.println("Copy file thành công!!!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
