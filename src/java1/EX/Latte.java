package java1.EX;

public class Latte extends Decorator{
    public Latte(Shot shot) {
        super(shot);
    }

    @Override
    public void brewing() {
        super.brewing();
        System.out.println("Adding Milk");
    }
}
