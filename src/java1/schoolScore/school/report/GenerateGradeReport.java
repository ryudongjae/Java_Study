package java1.schoolScore.school.report;

import java1.schoolScore.utils.Define;
import java1.schoolScore.grade.BasicEvaluation;
import java1.schoolScore.grade.GradeEvaluation;
import java1.schoolScore.grade.MajorEvaluation;
import java1.schoolScore.school.School;
import java1.schoolScore.school.Score;
import java1.schoolScore.school.Student;
import java1.schoolScore.school.Subject;

import java.util.ArrayList;

public class GenerateGradeReport {

    School school = School.getInstance();
    public static final String TITLE = " 수강생 학점 \t\t\n";
    public static final String HEADER = " 이름 |학번 | 중점과목  | 점수   \n";
    public static final String LINE = "-------------------------------------\n";
    private StringBuffer buffer = new StringBuffer();


    public String getReport(){
        ArrayList<Subject> subjectsList = school.getSubjectList();
        for(Subject subject : subjectsList){
            makeHeader(subject);
            makeBody(subject);
            makeFooter();

        }
        return buffer.toString();
    }

    public void makeHeader(Subject subject){
        buffer.append(GenerateGradeReport.LINE);
        buffer.append("\t" + subject.getSubjectName());
        buffer.append(GenerateGradeReport.TITLE );
        buffer.append(GenerateGradeReport.HEADER );
        buffer.append(GenerateGradeReport.LINE);

    }


    public void makeBody(Subject subject) {
        ArrayList<Student> studentList = subject.getStudentList();  // 각 과목의 학생들

        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
            buffer.append(student.getStudentName());
            buffer.append(" | ");
            buffer.append(student.getStudentId());
            buffer.append(" | ");
            buffer.append(student.getMajor().getSubjectName() + "\t");
            buffer.append("| ");

            getScoreGrade(student, subject.getSubjectId());  //학생별 해당과목 학점 계산
            buffer.append("\n");
            buffer.append(LINE);

        }
    }

    public void getScoreGrade(Student student, int subjectId){
        ArrayList<Score> scoreList = student.getScoreList();
        int majorId = student.getMajor().getSubjectId();

        GradeEvaluation[] gradeEvaluations= { new BasicEvaluation(), new MajorEvaluation()}; //학점 평가 클래스들

        for( int i = 0; i< scoreList.size(); i++){  //학생이 가진 점수들
            Score score = scoreList.get(i);
            if(score.getSubject().getSubjectId() == subjectId){ //현재 학점을 산출할 과목
                String grade;

                if(score.getSubject().getSubjectId() == majorId){
                    grade =  gradeEvaluations[Define.SAB_TYPE].getGrade(score.getPoint()); //중점 과목 학점평가 방법
                }else{
                    grade = gradeEvaluations[Define.AB_TYPE].getGrade(score.getPoint());//중점과목이 아닌 경우
                }

                buffer.append(score.getPoint());
                buffer.append(":");
                buffer.append(grade);
                buffer.append(" | ");
            }
        }

    }



    public void makeFooter(){
        buffer.append("\n");
    }
}
