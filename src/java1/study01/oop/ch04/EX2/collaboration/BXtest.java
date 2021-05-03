package java1.study01.oop.ch04.EX2.collaboration;

public class BXtest {
    public static void main(String[] args) {
        Person pp = new Person("KK",30000);
        Person tt = new Person("LL",20000);


        Bus bus1 = new Bus(1);
        Bus bus2 = new Bus(2);
        Bus bus3 = new Bus(3);


        Taxi t1 = new Taxi(1);
        Taxi t2 = new Taxi(2);
        Taxi t3 = new Taxi(3);

        pp.takeTaxi(t1);
        pp.showMoney();

        tt.takeBus(bus2);
        tt.showMoney();

        t1.showTaxi();
        bus2.showBus();
    }
}
