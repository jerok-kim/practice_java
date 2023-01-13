package mgs_online.ch05_java_data_structures.ex01;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {

    private ArrayList<Member> arrayList;  // ArrayList 선언

    public MemberArrayList() {
        arrayList = new ArrayList<Member>();  // 멤버로 선언한 ArrayList 생성
    }

    public void addMember(Member member) {  // ArrayList 에 멤버 추가
        arrayList.add(member);
    }

    // public boolean removeMember(int memberId) {  // 멤버 아이디를 매개변수로, 삭제 여부를 반환
    //
    //     for (int i = 0; i < arrayList.size(); i++) {  // 해당 아이디를 가진 멤버를 ArrayList에서 찾음
    //         Member member = arrayList.get(i);
    //         int tempId = member.getMemberId();
    //         if (tempId == memberId) {              // 멤버 아이디가 매개변수와 일치하면
    //             arrayList.remove(i);              // 해당 멤버를 삭제
    //             return true;                      // true 반환
    //         }
    //     }
    //
    //     System.out.println(memberId + "가 존재하지 않습니다");  // for 가 끝날때 까지 return 이 안된경우
    //     return false;
    // }

    /**
     * Iterator를 활용하여 구현
     * 
     * Collection 요소를 순회하는 Iterator
     * 
     * 요소의 순회란?
     * - 컬렉션 프레임워크에 저장된 요소들을 하나씩 차례로 참조하는것
     * - 순서가 있는 List인터페이스의 경우에는 Iterator를 사용하지 않고 get(i) 메서드를 활용할 수 있음
     * - Set 인터페이스의 경우 get(i) 메서드가 제공되지 않으므로 Iterator를 활용하여 객체를 순회함
     * 
     * Iterator 사용하기
     * - boolean hasNext(): 이후에 요소가 더 있는지를 체크하는 메서드, 요소가 있다면 true를 반환
     * - E next(): 다음에 있는 요소를 반환
     * 
     * @param memberId
     * @return
     */
    public boolean removeMember(int memberId) {  // 멤버 아이디를 매개변수로, 삭제 여부를 반환

        Iterator<Member> ir = arrayList.iterator();
        while (ir.hasNext()) {
            Member member = ir.next();
            int tempId = member.getMemberId();
            if (tempId == memberId) {
                arrayList.remove(member);
                return true;
            }
        }

        System.out.println(memberId + "가 존재하지 않습니다");
        return true;

    }

    public void showAllMember() {
        for (Member member : arrayList) {
            System.out.println(member);
        }
        System.out.println();
    }

}