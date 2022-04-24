package com.student;

import java.util.Scanner;

public class StudentUI {
    public Student student = new Student();

    public void setStudent() {
        Scanner sc = new Scanner(System.in);

        System.out.println("학번을 입력하세요.");
        student.id = sc.nextInt();

        System.out.println("이름을 입력하세요.");
        student.name = sc.next();

        System.out.println("학년을 입력하세요.");
        student.grade = sc.nextInt();
    }

    public void getStudent() {
        System.out.println("입력받은 학생의 정보입니다.");
        System.out.println("학번 : " + student.id);
        System.out.println("이름 : " + student.name);
        System.out.println("학년 : " + student.grade + "학년");
    }
}
