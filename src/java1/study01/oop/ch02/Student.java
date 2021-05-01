package java1.study01.oop.ch02;

public class Student {
    public String name;
    public String address;
    public int age;
    public String phoneNumber;


    public void showInfo(){
        System.out.println("이름은 " + name + " 이고 , 주소는 "+ address+"입니다. ("+" 나이 : "+ age+" ,전화번호 : " +phoneNumber +")");
    }
}
