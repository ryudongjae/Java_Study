package java1.collection.treeSet;

public class Member implements Comparable<Member>{
    private int memberId;
    private String memberName;

    public Member(int memberId, String memberName){
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }


    @Override
    public String toString() {
        return "Member{" +
                "memberId=" + memberId +
                ", memberName='" + memberName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Member member) {
        /*if (this.memberId > member.memberId){
            return 1;
        }else if (this.memberId < member.memberId){
            return -1;
        }**/
        return (this.memberId - member.memberId);  //오름차순
        //return (this.memberId - member.memberId) *  (-1);   내림 차순
    }
}
