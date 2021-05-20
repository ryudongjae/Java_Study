package java1.schoolScore.test;

import java1.schoolScore.school.School;
import java1.schoolScore.school.Score;
import java1.schoolScore.school.Student;
import java1.schoolScore.school.Subject;
import java1.schoolScore.school.report.GenerateGradeReport;
import java1.schoolScore.utils.Define;

public class TestMain {

    School aSchool = School.getInstance();
    Subject ComputerScience;
    Subject Architecture;

    GenerateGradeReport generateGradeReport = new GenerateGradeReport();

    public static void main(String[] args) {
        TestMain test = new TestMain();

        test.createSubject();
        test.createStudent();

        String report = test.generateGradeReport.getReport(); //성적 결과 생성
        System.out.println(report);  //출력
    }

    public void createSubject(){
        ComputerScience = new Subject("컴퓨터 공학", Define.ComputerScience);
        Architecture = new Subject("건축학  ",Define.Architecture);


        aSchool.addSubject(ComputerScience);
        aSchool.addSubject(Architecture);
    }

    public void createStudent(){
        Student st1 = new Student(001,"KIM ",Architecture);
        Student st2 = new Student(002,"LEE ",ComputerScience);
        Student st3 = new Student(003,"HA  ",ComputerScience);
        Student st4 = new Student(004,"RYU ",ComputerScience);
        Student st5 = new Student(005,"PARK",Architecture);

        aSchool.addStudent(st1);
        aSchool.addStudent(st2);
        aSchool.addStudent(st3);
        aSchool.addStudent(st4);
        aSchool.addStudent(st5);


        ComputerScience.register(st1);
        ComputerScience.register(st2);
        ComputerScience.register(st3);
        ComputerScience.register(st4);
        ComputerScience.register(st5);

        Architecture.register(st1);
        Architecture.register(st2);
        Architecture.register(st3);
        Architecture.register(st4);
        Architecture.register(st5);


        addScoreForStudent(st1,ComputerScience,90);
        addScoreForStudent(st1,Architecture,88);

        addScoreForStudent(st2,ComputerScience,95);
        addScoreForStudent(st2,Architecture,77);

        addScoreForStudent(st3,ComputerScience,91);
        addScoreForStudent(st3,Architecture,79);

        addScoreForStudent(st4,ComputerScience,100);
        addScoreForStudent(st4,Architecture,86);

        addScoreForStudent(st5,ComputerScience,99);
        addScoreForStudent(st5,Architecture,77);




    }

    public void addScoreForStudent(Student student, Subject subject, int point){
        Score score = new Score(student.getStudentId(), subject,point);
        student.addSubjectScore(score);
    }
}
