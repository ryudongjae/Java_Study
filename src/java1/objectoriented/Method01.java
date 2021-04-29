package java1.objectoriented;

public class Method01 {
    public int sum(int a,int b){
        return a+b;
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 43;

        Method01 myTest = new Method01();
        int c =myTest.sum(a,b);

        System.out.println(c);
    }
}
