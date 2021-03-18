package objectoriented;

public class Method {
    public int sum(int a,int b){
        return a+b;
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 43;

        Method myTest = new Method();
        int c =myTest.sum(a,b);

        System.out.println(c);
    }
}
