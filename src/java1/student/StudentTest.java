package java1.student;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student(100 ,"Lee");
        studentLee.setKoreaSubject("korea",80);
        studentLee.setMathSubject("math",90);

        studentLee.showScore();


        Student studentKim = new Student(101 ,"Kim");
        studentKim.setKoreaSubject("korea",100);
        studentKim.setMathSubject("math",100);

        studentKim.showScore();




    }
}
