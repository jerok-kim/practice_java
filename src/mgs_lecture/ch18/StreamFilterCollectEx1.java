package mgs_lecture.ch18;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterCollectEx1 {
    public static void main(String[] args) {

        List<LambdaProduct> list = new ArrayList<LambdaProduct>();

        list.add(new LambdaProduct(1, "삼성", 17000));
        list.add(new LambdaProduct(3, "아이폰", 65000));
        list.add(new LambdaProduct(2, "소니", 25000));
        list.add(new LambdaProduct(4, "노키아", 15000));
        list.add(new LambdaProduct(6, "레노바", 19000));

        List<Integer> productPriceList = list.stream()
                .filter(p -> p.price > 20000)  // 데이터 필터링
                .map(p -> p.price)  // 가격 얻어오기
                .collect(Collectors.toList());  // collecting list
        System.out.println(productPriceList);

    }
}
