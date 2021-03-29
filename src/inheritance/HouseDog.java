package inheritance;

public class HouseDog extends Dog{
    public HouseDog(String name){
        this.name= name;
    }
    public HouseDog(int type){
        if(type ==1){
            this.setName("yorkshire");
        }else if(type == 2){
            this.setName("bulldog");
        }
    }


    public void sleep() {
        System.out.println(this.name + " zzz in house");
    }

    public void sleep(int hour){

        System.out.println(this.name + " zzz in house " + hour+"hours");
    }

    public static void main(String[] args) {
        HouseDog happy = new HouseDog("happy");
        HouseDog houseDog = new HouseDog("happy");
        HouseDog bulldog = new HouseDog(2);
        houseDog.sleep();          //sleep메소드 호출
        houseDog.sleep(3);   //sleep(int hour)메소드 호출
        System.out.println(happy.name);
        System.out.println(bulldog.name);


    }
}
