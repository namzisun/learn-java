package com.student;

public class Student {
    /*
    정적 (static)
    프로그램이 로딩될 때 메모리 할당, 프로그램이 종료될 때 메모리 해제
    즉, 인스턴스 생성과 상관없이 사용 가능
    serialNum은 인스턴스들이 공유하는 변수가 된다.
     */
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

    /*
    serial 변수가 private static 이므로 static method를 통해 접근한다
    static method 내부에서는 인스턴스 변수를 사용할 수 없음!
    (static method는 인스턴스 생성 없이 호출이 가능한데, 인스턴스 변수는 인스턴스를 생성해야만 존재하기 때문)

    메소드 내에서 인스턴스 변수를 사용하지 않는다면 static을 붙여서 메소드 호출시간을 줄일 수 있다
     */
    public static int getSerialNum() {
        return serialNum;
    }
}
