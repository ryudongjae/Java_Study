package polymorphism;

import inteerface.Animal;
import inteerface.Predator;

public class Tiger extends Animal implements BarkablePredator {
    public String getFood(){
        return "apple";
    }
    public void bark(){
        System.out.println("어흥 ");
    }
}

