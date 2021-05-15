package java1.Exception.errorLog.ex;

import java1.Exception.errorLog.Log;

public class Student {
    private String studentName;
    Log myLog = Log.getLogger();

    public Student(String studentName){
        if (studentName == null){
            throw new StudentNameFormatException("name must not be null");
        }else if(studentName.split(" ").length > 3){
            throw new StudentNameFormatException("이름이 너무 깁니다.");
        }

        this.studentName = studentName;
    }

    public String getStudentName() {
        myLog.fine("begin getStudent");
        return studentName;
    }
}
