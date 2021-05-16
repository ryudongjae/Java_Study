package java1.inputOutput;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest3 {
    public static void main(String[] args) {

        try (FileOutputStream fos  = new FileOutputStream("output3.txt")){
            byte [] bs = new byte[26];
            byte data = 65;  //A의 아스키 값
            for (int i = 0; i< bs.length; i++){  //A-Z까지 출력하기
                bs[i] =  data;
                data ++;
            }
            fos.write(bs,2 ,10); //배열의 2번째 위치부터  10개의 바이트출ㄹ력하기
        } catch ( IOException e) {
            e.printStackTrace();
        }

        System.out.println("end");

    }
}
