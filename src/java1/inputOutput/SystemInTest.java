package java1.inputOutput;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest {
    public static void main(String[] args) {
        System.out.println("입력하시오");
        int i;
       try {
           InputStreamReader irs = new InputStreamReader(System.in); //시스템 인은 한글을 바이트 단위로 읽기 때문에 보조스트림으로 감싸 준다
            while ((i = irs.read()) != '\n'){
               System.out.print((char) i);
            }
           } catch (IOException e) {
               e.printStackTrace();
           }
       }
    }
