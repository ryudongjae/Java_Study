package java1.collection.treeMap;

import java1.collection.treeSet.Member;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {

    private HashMap<Integer, Member> hashMap;

    public MemberHashMap(Member member){
        hashMap = new HashMap<>();
    }

    public void addMember(Member member){
        hashMap.put(member.getMemberId(),member);
    }

    public boolean removeMember(int memberId){
        if(hashMap.containsKey(memberId)){
            hashMap.remove(memberId);
            return true;
        }
        System.out.println(memberId + "가 존재하지 않음 ");
        return false;
    }

    public void showMember(){
        Iterator<Integer> ir = hashMap.keySet().iterator();
        while (ir.hasNext()){
            int key =ir.next();
            Member member = hashMap.get(key);
            System.out.println(member);
        }
        System.out.println();
    }
}
