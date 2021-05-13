package java1.lambda;

public class AddTest {
    public static void main(String[] args) {

        Add addL = (int x, int y )->{return x+y;};
        System.out.println(addL.add(2,3));
    }
}
