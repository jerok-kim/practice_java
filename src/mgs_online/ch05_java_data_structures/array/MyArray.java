package mgs_online.ch05_java_data_structures.array;

/**
 * Array의 특징
 * <p>
 * - 동일한 데이터 타입을 순서에 따라 관리하는 자료 구조
 * - 정해진 크기가 있음
 * - 요소의 추가와 제거시 다른 요소들의 이동이 필요함
 * - 배열의 i번째 요소를 찾는 인덱스 연산이 빠름
 * - jdk 클래스: ArrayList, Vector
 */
public class MyArray {

    int[] intArr;  // int array
    int count;     // 개수

    public int ARRAY_SIZE;
    public static final int ERROR_NUM = -999999999;

    public MyArray() {
        count = 0;
        ARRAY_SIZE = 10;
        intArr = new int[ARRAY_SIZE];
    }

    public MyArray(int size) {
        count = 0;
        ARRAY_SIZE = size;
        intArr = new int[size];
    }

    public void addElement(int num) {
        if (count >= ARRAY_SIZE) {
            System.out.println("not enough memory");
            return;
        }
        intArr[count++] = num;
    }

    public void insertElement(int position, int num) {
        int i;

        if (position < 0 || position > count) {  // index error
            System.out.println("insert error");
            return;
        }

        if (count >= ARRAY_SIZE) {  // 꽉 찬 경우
            System.out.println("not enough memory");
            return;
        }

        for (i = count - 1; i >= position; i--) {
            intArr[i + 1] = intArr[i];
        }

        intArr[position] = num;
        count++;
    }

    public int removeElement(int position) {
        int ret = ERROR_NUM;
        if (isEmpty()) {
            System.out.println("There is no element");
            return ret;
        }

        if (position < 0 || position > (count - 1)) {  // index error
            System.out.println("remove error");
            return ret;
        }

        ret = intArr[position];

        for (int i = position; i < count - 1; i++) {
            intArr[i] = intArr[i + 1];
        }
        count--;

        return ret;
    }

    public int getSize() {
        return count;
    }

    public boolean isEmpty() {
        if (count == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int getElement(int position) {
        if (position < 0 || position > count - 1) {
            System.out.println("검색 위치 오류. 현재 리스트의 개수는 " + count + "개 입니다.");
            return ERROR_NUM;
        }
        return intArr[position];
    }

    public void printAll() {
        if (count == 0) {
            System.out.println("출력할 내용이 없습니다.");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.print(intArr[i] + "  ");
        }
        System.out.println();
    }

    public void removeAll() {
        for (int i = 0; i < count; i++) {
            intArr[i] = 0;
        }
        count = 0;
    }

}
