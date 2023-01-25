package mgs_lecture.ch18.functionalinf;

import java.util.function.*;
import java.util.*;

class LambdaFunctionalInfEx5 {
    public static void main(String[] args) {
        // Supplier<T> -> T get()
        Supplier<Integer> s = () -> (int) (Math.random() * 100) + 1; // 랜덤 값
        // Consumer<T> -> void accept(T t)
        Consumer<Integer> c = i -> System.out.print(i + ", ");
        // Predicate<T> -> boolean test(T t)
        Predicate<Integer> p = i -> i % 2 == 0; // 짝수 구하기
        // Function<T, R> -> R apply(T t)
        Function<Integer, Integer> f = i -> i / 10;
        Function<Integer, String> f2 = i -> "\"" + Integer.toString(i / 10) + "\""; // 문자열 표시

        List<Integer> list = new ArrayList<>();
        makeRandomList(s, list); // Supplier
        System.out.println("Supplier : " + list);
        printEvenNum(p, c, list); // Predicate, Consumer
        List<Integer> newList = doSomething(f, list); // function
        System.out.println(newList);
        List<String> newList2 = doSomething2(f2, list);
        System.out.println(newList2);
    }

    static <T> List<T> doSomething(Function<T, T> f, List<T> list) {
        System.out.print("Function : ");
        List<T> newList = new ArrayList<T>(list.size());
        for (T i : list) {
            newList.add(f.apply(i));
        }
        return newList;
    }

    static <T, R> List<R> doSomething2(Function<T, R> f, List<T> list) {
        System.out.print("Function : ");
        List<R> newList = new ArrayList<R>(list.size());
        for (T i : list) {
            // i/10
            newList.add(f.apply(i));
        }
        return newList;
    }

    static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list) {
        System.out.print("Predicate, Consumer : [");
        for (T i : list) {
            // i%2==0
            if (p.test(i)) // boolean return (짝수 여부)
                c.accept(i); // T 객체 소비 System.out.print(i+", ")
        }
        System.out.println("]");
    }

    static <T> void makeRandomList(Supplier<T> s, List<T> list) {
        for (int i = 0; i < 10; i++) {
            list.add(s.get()); // T 객체 리턴
        }
    }
}