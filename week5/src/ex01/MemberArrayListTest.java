package ex01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MemberArrayListTest {
    public static void main(String[] args) {

        MemberArrayList memberArrayList = new MemberArrayList();

        Member memberLee = new Member(1001, "이순신");
        Member memberKim = new Member(1002, "김유신");
        Member memberKang = new Member(1003, "강감찬");
        Member memberHong = new Member(1004, "홍길동");

        memberArrayList.addMember(memberLee);
        memberArrayList.addMember(memberKim);
        memberArrayList.addMember(memberKang);
        memberArrayList.addMember(memberHong);
        memberArrayList.showAllMember();

        memberArrayList.removeMember(memberHong.getMemberId());
        memberArrayList.showAllMember();

        long startTime;
        long endTime;
        List<String> linkedlist = new LinkedList<>();
        List<String> arraylist = new ArrayList<>();

        for(int i = 0; i < 10000; i++) {
            linkedlist.add(0, String.valueOf(i));
            //arraylist.add(0, String.valueOf(i));
        }

        for(int i = 0; i < 10000; i++) {
           // linkedlist.add(0, String.valueOf(i));
            arraylist.add(0, String.valueOf(i));
        }

        startTime = System.nanoTime();
        for(int i = 1000; i < 2000; i++) {
            linkedlist.remove(i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList remove 결린시간 : " + (endTime-startTime) + "ns");

        startTime = System.nanoTime();
        for(int i = 1000; i < 2000; i++) {
            arraylist.remove(i);
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList remove 결린시간 : " + (endTime-startTime) + "ns");

    }
}
