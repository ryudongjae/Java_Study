package java1.example.example1;

public class Student {

    public String studentName;
    public int money;

    public Student(String studentName,int money) {
        this.studentName = studentName;
        this.money = money;
    }

    public void takeBus(Bus bus){
        bus.take(1000);
        this.money -= 1000;
    }
    public void takeSubway(Subway subway){
        subway.take(1250);
        this.money -= 1250;
    }

    public void showInfo(){
        System.out.println(studentName +"님의 남은 돈은" +money + "원 입니다");
    }
}
