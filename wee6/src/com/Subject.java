package com;

import java.util.ArrayList;

public class Subject {
    private int subjectId;
    private String subjectName;
    private ArrayList<Student> studentList;
    private int gradeType;

    MajorEvaluation majorEvaluation;
    BasicEvaluation basicEvaluation;
    PFEvaluation pfEvaluation;

    public Subject(int subjectId, String subjectName, int gradeType) {

        this.subjectId = subjectId;
        this.subjectName = subjectName;

        // ArrayList가 사용되는 부분 Hashmap 활용 가능한지 수정
        studentList = new ArrayList();

        if (gradeType == 0) {
            this.gradeType = Define.basicType;
        }
        else if (gradeType == 2) {
            this.gradeType = Define.pfType;
        }
    }

    public void setStudentList(Student student) {
        studentList.add(student);
    }

    public int getGradeType() {
        return gradeType;
    }

    public void setGradeType(int gradeType) {
        this.gradeType = gradeType;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public void printGrade() {

        String result = null;

        // 여기서 Evaluation형으로 선언해두고 Basic/Major/PF 을 upcasting하는 형식으로 수정하기
        majorEvaluation = new MajorEvaluation();
        basicEvaluation = new BasicEvaluation();
        pfEvaluation = new PFEvaluation();

        for(Student student : studentList) {
            for(Score score : student.getScoreList()) {
                if (score.getSubject() == this) {
                    if (student.getMajorSubject() == this.subjectName) {
                        result = majorEvaluation.getScore(score.getScore());
                    }
                    else if (gradeType == 0) {
                        result = basicEvaluation.getScore(score.getScore());
                    }
                    else if (gradeType == 2) {
                        result = pfEvaluation.getScore(score.getScore());
                    }
                }
            }
            System.out.println(student.getStudentName() + " : " + result);
        }
    }

   //@Override
    public String toString() {
        return "Subject{" +
                "subjectId=" + subjectId +
                ", subjectName='" + subjectName + '\'' +
                ", studentList=" + studentList;
    }
}
