package java1.EX;

public class whippedCream extends Decorator{

    public whippedCream(Shot shot) {
        super(shot);
    }

    @Override
    public void brewing() {
        super.brewing();
        System.out.println("Adding whippingCream");
    }
}
