package polymorphism;

public class Bouncer {

    public void barkAnimal(Barkable animal){
        animal.bark();

    }
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        Crocodlie crocodlie = new Crocodlie();

        Bouncer bouncer = new Bouncer();
        bouncer.barkAnimal(tiger);
        bouncer.barkAnimal(lion);
        bouncer.barkAnimal(crocodlie);
    }
}
