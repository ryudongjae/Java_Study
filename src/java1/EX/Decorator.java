package java1.EX;

public abstract class Decorator extends Shot{
    public Shot shot;

    public Decorator(Shot shot) {
        this.shot = shot;
    }

    @Override
    public void brewing() {
        shot.brewing();
    }
}
