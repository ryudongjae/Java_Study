package java1.study01.oop.ch04.EX2.staticc;
//static
public class Person {

    private static int serialNum =1000;

    public static int getSerialNum() {
        return serialNum;
    }

    private int personId;
    private String personName;

    public Person(){
        serialNum ++;
        personId = serialNum;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public void showPerson(){
        System.out.println(personName +" 님의 아이디는 "+personId+"입니다." );
    }

    public static void main(String[] args) {
        Person pp = new Person();
        Person kk = new Person();
        pp.setPersonName("PP");
        kk.setPersonName("KK");

        pp.showPerson();
        kk.showPerson();

    }
}
