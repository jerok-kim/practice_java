package mgs_lecture.ch16.generics;

class GenericsDefineClsEx1<K, V> {
    private K key;
    private V value;

    public GenericsDefineClsEx1(K k, V V) {
        key = k;
        value = V;
    }

    public K getKey() {
        return key;
    }
}

public class GenericsDefineClsEx1Test {
    public static void main(String[] args) {
        // int 값을 넣었지만, auto boxing 때문에 Integer로 변환되어 갑니다
        GenericsDefineClsEx1<String, Integer> c1 = new GenericsDefineClsEx1<>("예시", 1);

        // 만약 제네릭 표시를 안하고 호출하는 경우 (Raw)
        GenericsDefineClsEx1 c2 = new GenericsDefineClsEx1("예시", 1);
        System.out.println(c2.getKey());
    }
}
