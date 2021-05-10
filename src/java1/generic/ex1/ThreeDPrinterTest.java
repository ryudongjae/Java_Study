package java1.generic.ex1;

public class ThreeDPrinterTest{
    public static void main(String[] args) {
        ThreeDPrinter<Powder> powderThreeDPrinter = new ThreeDPrinter<>();
        powderThreeDPrinter.setMaterial(new Powder());
        Powder powder = powderThreeDPrinter.getMaterial();
        System.out.println(powderThreeDPrinter);

        ThreeDPrinter<Plastic> plasticThreeDPrinter = new ThreeDPrinter<>();
        plasticThreeDPrinter.setMaterial(new Plastic());
        Plastic plastic = plasticThreeDPrinter.getMaterial();
        System.out.println(plasticThreeDPrinter);
    }
}
