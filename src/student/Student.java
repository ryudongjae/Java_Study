package student;

public class Student {
    int studentID;
    String studentName;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;

    }

    Subject math = new Subject();
    Subject korea= new Subject();


    public void setMathSubject(String name, int score) {
       math.subjectName = name;
       math.subjectScore = score;
    }

    public void setKoreaSubject(String name,int score) {
        korea.subjectName = name;
        korea.subjectScore = score;
    }

    public void showScore(){
        int total = korea.subjectScore + math.subjectScore;
        int average = (korea.subjectScore + math.subjectScore)/2;
        System.out.println(studentName+ "학생의 총점은 " + total +"점 이고 평균은 "+average+"입니다. ");
    }
}
