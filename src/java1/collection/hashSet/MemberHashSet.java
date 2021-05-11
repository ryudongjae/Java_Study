package java1.collection.hashSet;

import java.util.HashSet;

public class MemberHashSet {
    private HashSet<Member> hashSet;

    public MemberHashSet() {
        hashSet = new HashSet<Member>();
    }

    public void addMember(Member member){
        hashSet.add(member);
    }



}
