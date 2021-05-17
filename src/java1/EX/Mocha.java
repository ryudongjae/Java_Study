package java1.EX;

public class Mocha extends Decorator{


    public Mocha(Shot shot) {
        super(shot);
    }

    @Override
    public void brewing() {
        super.brewing();
        System.out.println("Adding Mocha Syrup");
    }
}
