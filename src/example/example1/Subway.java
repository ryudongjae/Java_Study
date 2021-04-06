package example.example1;

public class Subway {

    public int lineNumber;
    public int passengerCount;
    public int money;

    public Subway(int lineNumber){
        this.lineNumber = lineNumber;

    }

    public void take(int money){
        this.money += money;
        passengerCount++;
    }
    public void showSubwayInfo(){
        System.out.println(lineNumber+ "번 지하철의 승객은 " +passengerCount + "명 이고,수입은 "+money);
    }
}
