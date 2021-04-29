package java1.abstractEx;

public  class DeskTop extends Computer{
    @Override
    void display() {
        System.out.println("DeskTop display");
    }

    @Override
    void typing() {
        System.out.println("DeskTop typing");
    }

    @Override
    public void turnOn() {
        System.out.println("deskTop turnOn");
    }

    @Override
    public void turnOff() {
        System.out.println("desktop turnOff");
    }
}
