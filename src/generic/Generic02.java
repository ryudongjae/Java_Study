package generic;

class ClassName1<K,V>{
    private K first;
    private V second;

    void set(K first,V second){
        this.first = first;
        this.second = second;
    }

    K getFirst(){
        return first;
    }

    V getSecond(){
        return second;
    }

}
public class Generic02 {
    public static void main(String[] args) {
        ClassName1<String,Integer> a = new ClassName1<>();
        a.set("10",10);

        System.out.println(" first data : "+ a.getFirst());
        //반환된 변수의 타입 출력
        System.out.println("K Type :" + a.getFirst().getClass().getName());

        System.out.println(" second data : "+ a.getSecond());
        //반환된 변수의 타입 출력
        System.out.println("V Type :" + a.getSecond().getClass().getName());

    }
}
