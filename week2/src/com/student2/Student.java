package com.student2;

import java.util.ArrayList;

/**
ArrayList
: 크기 조절 가능한 객체 배열
: 표준배열보다는 느리지만 배열에서 많은 조작이 필요한 경우 유용하게 사용가능
 */

/**
 * JavaDoc : 자바 문서 생성
 * API 문서라던가 description...
 * html 태그 활용
 */
public class Student {
    private int studentID;
    private String studentName;
    ArrayList<Subject> subjectList;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
        //<>로 타입을 선언하면 해당 타입의 데이터만 추가할 수 자있다
        subjectList = new ArrayList<Subject>();
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void addSubject(String subjectName, int score) {
        Subject subject = new Subject();
        subject.setSubjectName(subjectName);
        subject.setScore(score);
        subjectList.add(subject);
    }

    public void showStudentInfo() {
        int total = 0;
        /**
         * Enhanced for문 : 순차적으로 순회
         * 장 - 직관적, 가독성, 안정성(인덱스 이용 안하므로)
         * 단 - 인덱스를 이용 못함
         *
         * iterater를 상속받는 모든 애들은 enhanced for문을 사용할 수 있다.
         */
        for (Subject s : subjectList) {
            total += s.getScore();
            System.out.println("학생 " + studentName + "의 " + s.getSubjectName() + " 과목 성적은 " + s.getScore() + "입니다.");
        }
        System.out.println("학생 " + studentName + "의 총점은" + total + "입니다.");
    }
}
