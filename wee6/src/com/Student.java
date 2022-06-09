package com;

import java.util.ArrayList;

public class Student {
    private int studentId;
    private String studentName;
    private String major;
    private String majorSubject;
    // 여기서 hashmap 사용
    private ArrayList<Score> scoreList;

    public Student(int studentId, String studentName, String major) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.major = major;
        scoreList = new ArrayList();
        setMajorSubject();
    }

    public void setMajorSubject() {
        if (major.equals("국어국문학과")) {
            majorSubject = "국어";
        }
        else if (major.equals("컴퓨터공학과")) {
            majorSubject = "수학";
        }
    }

    public void setScoreList(Score score) {
        //Score score = new Score(this.studentId,subject, point);
        scoreList.add(score);
    }

    public ArrayList<Score> getScoreList() {
        return scoreList;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getMajor() {
        return major;
    }

    public String getMajorSubject() {
        return majorSubject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", major='" + major + '\'' +
                ", majorSubject='" + majorSubject + '\'' +
                ", scoreList=" + scoreList +
                '}';
    }

    public int getStudentId() {
        return this.studentId;
    }
}
