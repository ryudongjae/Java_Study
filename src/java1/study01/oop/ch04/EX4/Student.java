package java1.study01.oop.ch04.EX4;

import java.util.ArrayList;

public class Student {
    private int studentId;
    private String studentName;
    ArrayList<Subject> list ;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;

        list = new ArrayList<Subject>();
    }



    public void addSubject(String subjectName, int score) {
        Subject subject = new Subject();
        subject.setSubjectName(subjectName);
        subject.setScore(score);
        list.add(subject);
    }

    public void showStudentInfo() {
        int total = 0;

        for (Subject s : list){
            total += s.getScore();
            System.out.println("학생 "+ studentName+ "의 " + s.getSubjectName()+"과목 성적은 "+s.getScore()+"점 입니다. ");
        }
        System.out.println(studentName+ "님의 총점은 "+ total+"입니다. " );
    }
}
