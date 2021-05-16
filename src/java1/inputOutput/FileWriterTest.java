package java1.inputOutput;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {

        try(FileWriter fw = new FileWriter("writer.txt")){
            fw.write('A');
            char [] buf = {'B','C','D','E','F'};

            fw.write(buf);
            fw.write("HI,안");
            fw.write(buf,2,3);
        }catch(IOException e){
            e.printStackTrace();
        }

        System.out.println("end");
    }
}
