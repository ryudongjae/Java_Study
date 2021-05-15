package java1.Exception.errorLog.ex;

import java1.Exception.errorLog.Log;

public class StudentTest {
    public static void main(String[] args) {
        Log myLog = Log.getLogger();

        String name = null;

        try{
            Student student = new Student(name);
        }catch (StudentNameFormatException e){
            myLog.warning(e.getMessage());
        }

        try{
            Student student = new Student("Edword Jon Kim Test");
        }catch (StudentNameFormatException e){
            myLog.warning(e.getMessage());
        }

        Student student = new Student("James");
    }
}
