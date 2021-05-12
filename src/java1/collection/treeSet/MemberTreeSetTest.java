package java1.collection.treeSet;



public class MemberTreeSetTest {
    public static void main(String[] args) {

        MemberTreeSet memberTreeSet = new MemberTreeSet();

        Member m1 = new Member(100, "KIM");
        Member m2 = new Member(101, "Lee");
        Member m3 = new Member(102,"LIM");
        Member m4 = new Member(103,"PARK");

        memberTreeSet.addMember(m1);
        memberTreeSet.addMember(m2);
        memberTreeSet.addMember(m3);
        memberTreeSet.addMember(m4);


        memberTreeSet.showMember();
    }
}
