package java1.study01.oop.ch04.EX1;

public class Student {
    public String studentName;
    public int studentId;

    Subject korea;
    Subject math;

    public Student(String studentName, int studentId){
        this.studentName = studentName;
        this.studentId = studentId;

        korea = new Subject();
        math = new Subject();
    }

    public void setKorea(String subjectName , int score){
        korea.subjectName = subjectName;
        korea.score = score;
    }

    public void setMath(String subjectName , int score){
        math.subjectName = subjectName;
        math.score = score;
    }

    public void scoreInfo(){
        int totalScore = math.score + korea.score;

        System.out.println(studentName+" 학생의 총점은 " +totalScore +"점 입니다. ");
    }

    public static void main(String[] args) {
        Student kk = new Student("KK",001);
        kk.setMath("math",100);
        kk.setKorea("korea" ,100);
        kk.scoreInfo();
    }
}
