package com.student2;

public class Student {
    private int studentID;
    private String studentName;

    Subject korea = new Subject();
    Subject math = new Subject();

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public void setKorean(String koreaSubject, int koreaScore) {
        korea.setSubject(koreaSubject);
        korea.setScore(koreaScore);
    }

    public void setMath(String mathSubject, int mathScore) {
        math.setSubject(mathSubject);
        math.setScore(mathScore);
    }

    public void showStudentInfo() {
        System.out.print("학생" + studentName + "의 총점은 ");
        System.out.print(korea.getScore() + math.getScore());
        System.out.println(" 입니다.");
    }
}
