package study01;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();//인스턴스 생성
        Student student2 = new Student();//인스턴스 생 각각다른 메모리를 사용하기 때문에 다른값을 줄수 있
                //student1 참조 변수
        student1.studentId =1;
        student2.studentId =2;

        student1.studentName="Kim";
        student2.studentName="Lee";

        student1.address="Seoul";
        student2.address="Seoul";

        student1.showStudentInfo();
        student2.showStudentInfo();

        System.out.println(student1);
        System.out.println(student2);


    }
}
