package java1.collection.treeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {

    private TreeSet<Member> treeSet;

    public MemberTreeSet() {
        treeSet = new TreeSet<Member>();
    }

    public void addMember(Member member){
        treeSet.add(member);
    }

    public boolean removeMember(int memberId){

        Iterator<Member> ir = treeSet.iterator();
        while (ir.hasNext()){
            Member member = ir.next();
            int temp = member.getMemberId();
            if(temp == memberId){
                treeSet.remove(member);
                return true;
            }
        }
        return false;
    }

    public void showMember(){
        for (Member member: treeSet){
            System.out.println(member);
        }
        System.out.println();
    }
}
