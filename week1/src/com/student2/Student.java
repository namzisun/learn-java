package com.student2;

public class Student {
    private int studentID;
    private String studentName;

    Subject subject = new Subject();

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public void setKorean(String koreaSubject, int koreaScore) {
        subject.setKoreaSubject(koreaSubject);
        subject.setKoreaScore(koreaScore);
    }

    public void setMath(String mathSubject, int mathScore) {
        subject.setMathSubject(mathSubject);
        subject.setMathScore(mathScore);
    }

    public void showStudentInfo() {
        System.out.print("학생" + studentName + "의 총점은 ");
        System.out.print(subject.getKoreaScore() + subject.getMathScore());
        System.out.println(" 입니다.");
    }
}
