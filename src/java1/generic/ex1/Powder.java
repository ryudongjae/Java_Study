package java1.generic.ex1;

public class Powder extends Material{
    public String toString(){
      return "Powder";
    }

    @Override
    public void doPrinting() {
        System.out.println("powder");
    }
}
