package java1.stream.EX;

public class StringConcatImpl implements StringConcat{
    @Override
    public void makeString(String s1, String s2) {
        System.out.println(s1 + "," + s2);
    }
}
class Test{
    public static void main(String[] args) {

        String s1 = "Hi";
        String s2 = "Man";
        StringConcatImpl concat = new StringConcatImpl();
        concat.makeString(s1,s2);

        StringConcat concat1 = (s ,v)-> System.out.println(s + "," + v);
        concat1.makeString(s1,s2);
    }
}
