package com.student;

public class Student {
    private static int serialNum = 1000;
    String studentName;
    int studentID;

    public Student() {
        studentID = ++serialNum;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public static int getSerialNum() {
        return serialNum;
    }
}
