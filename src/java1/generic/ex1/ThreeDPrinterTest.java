package java1.generic.ex1;

public class ThreeDPrinterTest{
    public static void main(String[] args) {
        ThreeDPrinter<Powder> powderThreeDPrinter = new ThreeDPrinter<>();
        powderThreeDPrinter.setMaterial(new Powder());
        System.out.println(powderThreeDPrinter);

        ThreeDPrinter<Plastic> plasticThreeDPrinter = new ThreeDPrinter<>();
        plasticThreeDPrinter.setMaterial(new Plastic());
        System.out.println(plasticThreeDPrinter);
    }
}
