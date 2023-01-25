package mgs_lecture.ch16.generics;

class DefineClass2<T, S> {
    private T data;
    private S data2;

    DefineClass2(T data, S data2) {
        this.data = data;
        this.data2 = data2;
    }

    public T getData() {
        return data;
    }

    public S getData2() {
        return data2;
    }
}

public class GenericsDefineEx2 {
    public static void main(String[] args) {
        DefineClass2<String, Integer> dc = new DefineClass2<>("Hello~", 1234);
        System.out.println(dc.getData());
        System.out.println(dc.getData2());
    }
}
