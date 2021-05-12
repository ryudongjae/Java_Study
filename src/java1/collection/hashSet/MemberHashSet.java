package java1.collection.hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
    private HashSet<Member> hashSet;

    public MemberHashSet() {
        hashSet = new HashSet<Member>();
    }

    public void addMember(Member member){
        hashSet.add(member);
    }

    public boolean removeMember(int memberId){

        Iterator<Member> ir = hashSet.iterator();

        while(ir.hasNext()){
            Member member = ir.next();
            int temp = member.getMemberId();
            if(temp == memberId){
                hashSet.remove(member);
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    public void showMember(){
        for (Member member :hashSet){
            System.out.println(member);
        }
        System.out.println();
    }

}
