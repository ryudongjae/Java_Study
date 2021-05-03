package java1.study01.oop.ch04.EX2;

public class This {
    public String name;
    public int age;

    public This(){
        this("no name " ,1);  //생성자에서 다른 생성자 호출하는 this
    }

    public This(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void showPerson(){
        System.out.println(name +","+age);
    }
    public This getThis(){
        return this;
    }

    public static void main(String[] args) {
        This p =new This();
        p.showPerson();

        System.out.println(p);

        This t = p.getThis();
        System.out.println(t);
    }
}
