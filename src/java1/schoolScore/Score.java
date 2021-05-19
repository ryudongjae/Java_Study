package java1.schoolScore;

public class Score {
    private int studentId; //학번
    private Subject subject;  //과목
    private int point;  //점수

    public Score(int studentId, Subject subject, int point) {
        this.studentId = studentId;
        this.subject = subject;
        this.point = point;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "학번 : "+ getStudentId() +","+ subject.getSubjectName()+" : "+point;
    }
}
