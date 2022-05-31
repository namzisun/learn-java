package ex04;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
    TreeSet<Member> memberTreeSet;

    public MemberTreeSet() {
        memberTreeSet = new TreeSet<>(Collections.reverseOrder());
    }

    public void addMember(Member member) {
        memberTreeSet.add(member);
    }

    public void showAllMember() {
        Iterator<Member> iterator = memberTreeSet.iterator();
        while (iterator.hasNext()) {
            Member member = iterator.next();
            System.out.println(member);
        }
    }
}
