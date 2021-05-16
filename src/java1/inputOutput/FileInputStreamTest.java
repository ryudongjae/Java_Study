package java1.inputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {
    public static void main(String[] args) {
            FileInputStream fis = null;
        try {
            fis = new FileInputStream("input.txt");
            System.out.println((char)fis.read());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                System.out.println(e);
            }catch (NullPointerException e ){
                System.out.println(e);
            }
        }
        System.out.println("end");

    }
}
