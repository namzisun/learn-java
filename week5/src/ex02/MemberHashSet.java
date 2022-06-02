package ex02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MemberHashSet {
    public Set<Member> memberHash;

    public MemberHashSet() {
        memberHash = new HashSet<> ();
    }

    public void addMember(Member member) {
        memberHash.add(member);
    }

    public void showAllMember() {
        Iterator<Member> iterator = memberHash.iterator();
        while (iterator.hasNext()) {
            Member member = iterator.next();
            System.out.println(member);
        }
    }
}
