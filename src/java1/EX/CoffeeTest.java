package java1.EX;

public class CoffeeTest {
    public static void main(String[] args) {
        Shot espresso =new Espresso();
        espresso.brewing();

        Shot americano = new KenyaAmericano();
        americano.brewing();

        Shot mocha = new Mocha(new Latte(espresso));
        mocha.brewing();


        Shot latte = new Latte(espresso);
        latte.brewing();

    }

}
