package com.student2;

import java.util.ArrayList;

public class Student {
    private int studentID;
    private String studentName;
    ArrayList<Subject> subjectList;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
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
        for (Subject s : subjectList) {
            total += s.getScore();
            System.out.println("학생 " + studentName + "의 " + s.getSubjectName() + " 과목 성적은 " + s.getScore() + "입니다.");
        }
        System.out.println("학생 " + studentName + "의 총점은" + total + "입니다.");
    }
}
