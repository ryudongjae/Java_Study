package java1.study01.oop.ch03;

//오버로딩(Overloading) : 같은 이름의 메서드 여러개를 가지면서 매개변수의 유형과 개수가 다르도록 하는 기술

public class Example {
    private  String name;
    private int age;
    private int height;
    private int weight;
    private String gender;

    public Example(String name,int age,int height,int weight,String gender){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.gender = gender;

    }

    public void showProfile(){
        System.out.println("키가 "+height+"이고 몸무게가 " +weight+"킬로인 "+gender+"이 있습니다.이름은 " +name+"이고 나이는 "+age +"세입니다");
    }

    public static void main(String[] args) {
        Example LL = new Example("Tomas",37,180,72,"남성");
        LL.showProfile();
    }
}
