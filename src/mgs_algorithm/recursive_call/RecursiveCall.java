package mgs_algorithm.recursive_call;

/*
 * 재귀 용법 (recursive call, 재귀 호출)
 *  - 고급 정렬 알고리즘에서 재귀 용법을 사용하므로, 고급 정렬 알고리즘을 익히기 전에 재귀 용법을 먼저 익히기로 한다.
 *
 * 1. 재귀 용법 (recursive call, 재귀 호출)
 *  - 함수 안에서 동일한 함수를 호출하는 형태
 *  - 여러 알고리즘 작성시 사용되므로, 익숙해져야 함
 *
 * 2. 재귀 용법 이해
 *  - 예제
 *      - 팩토리얼을 구하는 알고리즘을 Recursive Call 을 활용해서 알고리즘 작성하기
 *
 * 3. 예제 - 시간 복잡도와 공간 복잡도
 *  - factorial(n)은 n-1 번의 factorial() 함수를 호출해서, 곱셈을 함
 *      - 일종의 n-1 번 반복문을 호출한 것과 동일
 *      - factorial() 함수를 호출할 때마다, 지역변수 n 이 생성됨
 *  - 시간 복잡도 / 공간 복잡도는 O(n-1) 이므로 결국, 둘 다 O(n)
 * 
 * 4. 재귀 호출의 일반적인 형태
 *  - 일반적인 형태 1:
 *  function(입력) {
 *      if(입력 > 일정값) {              // 입력이 일정 값 이상이면
 *          return function(입력 - 1);  // 입력보다 작은 값
 *      } else {
 *          return 특정값;  // 재귀 호출 종료
 *      }
 *  }
 * 
 *  - 일반적인 형태 2:
 *  function(입력) {
 *      if(입력 <= 일정값) {   // 입력이 일정 값보다 작으면
 *          return 특정값;    // 재귀 호출 종료
 *      }
 *      return function(입력 - 1);
 *  }
 * 
 * 5. 재귀 호출은 스택의 전형적인 예
 *  - 함수는 내부적으로 스택처럼 관리된다.
 * 
 * 
 * 참고: ArrayList의 subList 메서드
 * 
 * public List<E> subList(int fromIndex, int toIndex)
 * 
 * - fromIndex: 서브셋이 시작할 인덱스
 * - toIndex: 서브셋의 마지막 인덱스
 * 
 */

public class RecursiveCall {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println(factorial.factorialFunc(10));

    }
}
