package ex01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MemberArrayList {
    private List<Member> memberList;

    public MemberArrayList() {
        memberList = new ArrayList<> ();
    }

    public void addMember(Member member) {
        memberList.add(member);
    }

    public void showAllMember() {
        Iterator<Member> iterator = memberList.iterator();
        while (iterator.hasNext()) {
            Member member = iterator.next();
            System.out.println(member);
        }
    }

    public void removeMember(int memberId) {
        Iterator<Member> iterator = memberList.iterator();
        // ListIterator -> 양방향 iterator
        while (iterator.hasNext()) {
            Member member = iterator.next();
            if (member.getMemberId() == memberId) {
                iterator.remove();
                // memberList.remove(member);
                // break;
                // break 안해주면 ConcurrentModificationException 에러
            }
        }
    }

}
