package polymorphism;

public class Crocodlie extends Animal implements BarkablePredator{


    public String getFood() {
        return "meet";
    }

    public void bark() {
        System.out.println("크앙 ");
    }
}
