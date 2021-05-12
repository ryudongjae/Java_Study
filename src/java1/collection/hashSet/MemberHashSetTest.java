package java1.collection.hashSet;




public class MemberHashSetTest {
    public static void main(String[] args) {

        MemberHashSet memberHashSet = new MemberHashSet();

        Member m1 = new Member(100, "KIM");
        Member m2 = new Member(101, "Lee");
        Member m3 = new Member(102,"LIM");
        Member m4 = new Member(103,"PARK");
        Member m5 = new Member(103,"PRK");

        memberHashSet.addMember(m1);
        memberHashSet.addMember(m2);
        memberHashSet.addMember(m3);
        memberHashSet.addMember(m4);
        memberHashSet.addMember(m5);
        memberHashSet.removeMember(m4.getMemberId());


        memberHashSet.showMember();
    }
}
