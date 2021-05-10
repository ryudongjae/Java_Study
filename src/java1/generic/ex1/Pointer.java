package java1.generic.ex1;

public class Pointer <T,V>{
    T x;
    V y;

    public Pointer(T x, V y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public V getY() {
        return y;
    }
}
