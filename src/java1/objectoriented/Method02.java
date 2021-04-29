package java1.objectoriented;

public class Method02 {

    public void sum(int a,int b){
        System.out.println(a+"과 "+b+"의 합은 "+(a+b)+"입니다. ");

    }

    public static void main(String[] args) {
        Method02 myTest = new Method02();
        myTest.sum(3,4);


    }
}
