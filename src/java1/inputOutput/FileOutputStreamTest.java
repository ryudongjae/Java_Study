package java1.inputOutput;

import java.io.FileOutputStream;
import java.io.IOException;
//byte[] 배열에 A-Z 까지 넣고 배열을 한꺼번에 파일에 쓰기
public class FileOutputStreamTest {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos  = new FileOutputStream("output1.txt",true);
        try (fos){
            byte [] bs = new byte[26];
            byte data = 65; // 'A' 의 아스키 값
            for (int i = 0; i< bs.length; i++){
                bs[i] = data;
                data++;
            }
            fos.write(bs);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
