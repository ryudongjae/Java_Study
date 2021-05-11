package java1.collection.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {

    private ArrayList<Member> memberArrayList;

    public MemberArrayList() {
        memberArrayList = new ArrayList<>();
    }

    public MemberArrayList(int size) {
        memberArrayList = new ArrayList<>(size);
    }

    public void addMember(Member member) {
        memberArrayList.add(member);
    }

    public boolean removeMember(int memberId) {
        Iterator<Member> ir = memberArrayList.iterator();
            while (ir.hasNext()){
                Member member = ir.next();
            int tempId = memberId;
            if (tempId == memberId) {  //멤버아이디가 매개변수와 일치하면
                memberArrayList.remove(member);  //해당맴버를 삭제
                return true;  //삭제후 true 반환
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember(){
        for (Member member :  memberArrayList){
            System.out.println(member);
        }
        System.out.println();
    }
}
