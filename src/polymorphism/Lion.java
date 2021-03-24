package polymorphism;

import inteerface.Animal;

public class Lion extends Predator implements BarkablePredator {

    public String getFood() {
        return "banana";
    }
    public void bark(){
        System.out.println("으르릉 ");
    }
}
