package ex05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MemberHashMap {
    private HashMap<Integer, Member> memberHashMap;

    MemberHashMap () {
        memberHashMap = new HashMap<>();
    }

    public void addMember(Member member) {
        memberHashMap.put(member.getMemberId(), member);
    }

    public void showAllMember() {
        Iterator<Map.Entry<Integer, Member>> iterator = memberHashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Member> it = iterator.next();
            System.out.println(it);
        }
    }

    public void removeMember(int memberId) {
        memberHashMap.remove(memberId);
    }
}
