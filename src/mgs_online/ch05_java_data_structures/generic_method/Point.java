package mgs_online.ch05_java_data_structures.generic_method;

public class Point<T, V> {

    T x;
    V y;

    Point(T x, V y) {
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
