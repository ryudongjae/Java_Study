package java1.collection.arrayList;

public class MemberArrayListTest {
    public static void main(String[] args) {

        MemberArrayList memberArrayList = new MemberArrayList();

        Member m1 = new Member(100, "KIM");
        Member m2 = new Member(101, "Lee");
        Member m3 = new Member(102,"LIM");
        Member m4 = new Member(103,"PARK");

        memberArrayList.addMember(m1);
        memberArrayList.addMember(m2);
        memberArrayList.addMember(m3);
        memberArrayList.addMember(m4);

        memberArrayList.showAllMember();
        memberArrayList.removeMember(m1.getMemberId());
        memberArrayList.showAllMember();


    }
}
