package ex02;

import java.util.Objects;

public class Member {
    private int memberId; //회원 아이디
    private String memberName; //회원 이름

    public Member(int memberId, String memberName){ //생성자
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
    public int hashCode() {
        return String.valueOf(memberId).hashCode();
    }
    // hashCode와 equals 둘 다 사용하는 이유? -> 해시충돌
    // String.valueOf : String hash가 더 강점이 있다 -> 찾아보세요

    @Override
    public boolean equals(Object obj) {
        if( obj instanceof Member){
            Member member = (Member)obj;
            if( this.memberId == member.memberId )
                return true;
            else
                return false;
        }
        return false;
    }

    @Override
    public String toString(){ //toString 메소드 오버로딩
        return memberName + " 회원님의 아이디는 " + memberId + "입니다";
    }
}
