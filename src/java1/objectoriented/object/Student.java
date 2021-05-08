package java1.objectoriented.object;

public class Student implements Cloneable{
    private int studentId;
    private String studentName;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public boolean equals(Object obj){
        if (obj instanceof Student){
            Student stu = (Student) obj;
            if(this.studentId == stu.studentId){
                return true;
            }else {
                return false;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return studentId;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student(1,"KIM");
        Student s2 = s1;
        Student s3 = new Student(1,"KIM");

        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));

        System.out.println(s1.hashCode());
        System.out.println(s3.hashCode());

        Integer i1 = new Integer(100);
        Integer i2 = new Integer(100);

        System.out.println(i1.equals(i2));
        System.out.println(i1.hashCode());
        System.out.println(i2.hashCode());

        System.out.println(System.identityHashCode(i1));
        System.out.println(System.identityHashCode(i2));

        Student s4 = (Student)s1.clone();
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s4));

    }
}
