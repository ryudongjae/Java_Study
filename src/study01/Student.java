package study01;

public class Student {
    public int studentId;
    public String studentName;
    public String address;

    public void showStudentInfo(){
        System.out.println("ID:"+studentId+" "+studentName+","+address);
    }
    public String getStudentName(){
        return studentName;
    }
}
