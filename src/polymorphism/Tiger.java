package polymorphism;

import inteerface.Animal;

public class Tiger extends Predator implements BarkablePredator {
    public String getFood(){
        return "apple";
    }
    public void bark(){
        System.out.println("어흥 ");
    }
}

