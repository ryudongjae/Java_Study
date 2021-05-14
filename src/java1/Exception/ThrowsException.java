package java1.Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

    public Class loadClass(String fileName,String className) throws FileNotFoundException, ClassNotFoundException {
        FileInputStream fis  = new FileInputStream(fileName); //FileNotFoundException 발생
        Class c = Class.forName(className); // ClassNotFoundException 발생.

        return c;
    }

    public static void main(String[] args) {
        ThrowsException test = new ThrowsException();

        try{
            test.loadClass("a.txt","java.lang.String");

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

/*try {
	test.loadClass("a.txt", "java.lang.String");
	} catch (FileNotFoundException | ClassNotFoundException e) {
		e.printStackTrace();
	}
	여러개의 예외가 발생하는 경우 예외를 묶어서 하나의 방법으로 처리할 수도 있고,
**/
