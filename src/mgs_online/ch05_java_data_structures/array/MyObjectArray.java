package mgs_online.ch05_java_data_structures.array;

public class MyObjectArray {

    private int cout;
    private Object[] array;
    public int ARRAY_SIZE;

    public MyObjectArray() {
        ARRAY_SIZE = 10;
        array = new Object[ARRAY_SIZE];
    }

    public MyObjectArray(int size) {
        ARRAY_SIZE = size;
        array = new Object[ARRAY_SIZE];
    }
    
}
