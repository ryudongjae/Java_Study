package example.example1;

public class Count {
    public static void main(String[] args) {
        Student student1 = new Student("kim",10000);
        Student student2 = new Student("lim",12000);

        Bus bus = new Bus(100);
        Bus bus1 = new Bus(101);
        Bus bus2 = new Bus(102);

        Subway subway = new Subway(1);
        Subway subway1 = new Subway(2);
        Subway subway2 = new Subway(3);

        student1.takeBus(bus);
        student2.takeSubway(subway2);

        student1.showInfo();
        student2.showInfo();

        bus.showBusInfo();

        subway1.showSubwayInfo();
        subway2.showSubwayInfo();
    }
}
