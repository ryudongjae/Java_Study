package java1.lambda;

@FunctionalInterface //함수형 인터페이스를 의미한다.  내부에 여러개의 메서드를 선언하면 에러남
public interface Add {
    public int add(int x, int y);
}
