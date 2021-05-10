package java1.generic.ex1;

public class Plastic extends Material{
    public String toString(){
     return "Plastic";
    }

    @Override
    public void doPrinting() {
        System.out.println("plastic");
    }
}
