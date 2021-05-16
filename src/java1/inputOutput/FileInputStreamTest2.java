package java1.inputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 {
    public static void main(String[] args) {

        try(FileInputStream fis = new FileInputStream("input.txt")) {
            int i;
            while((i = fis.read()) != -1){
                System.out.print((char)i);
            }
            System.out.println("end");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);

        }
    }
}
