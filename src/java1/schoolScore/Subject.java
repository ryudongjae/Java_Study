package java1.schoolScore;

import java.util.ArrayList;

public class Subject {
    private String subjectName; // 과목 이름
    private int subjectId; //과목 고유번호
    private int gradeType; //과목 평가 기본방법은 A,B방식


    private ArrayList<Student> studentList = new ArrayList<>();

    public String getSubjectName() {
        return subjectName;
    }
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
    public int getSubjectId() {
        return subjectId;
    }
    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }
    public int getGradeType() {
        return gradeType;
    }
    public void setGradeType(int gradeType) {
        this.gradeType = gradeType;
    }
    public ArrayList<Student> getStudentList() {
        return studentList;
    }
    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public void register(Student student){
        studentList.add(student);
    }

    public Subject(String subjectName, int subjectId, int gradeType) {
        this.subjectName = subjectName;
        this.subjectId = subjectId;
        this.gradeType = Define.AB_TYPE;
    }
}

