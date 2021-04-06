package example.example1;

public class Bus {

    public int busNumber;
    public int passengerCount;
    public int money;

    public Bus(int busNumber){
        this.busNumber = busNumber;

    }
    public void take(int money){
        this.money += money;
        passengerCount++;
    }

    public void showBusInfo(){
        System.out.println(busNumber + "번 버스의 승객은 "+passengerCount+"명 이고, 수입은 "+money);
    }
}
