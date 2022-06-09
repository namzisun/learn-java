package com;

public class StudentTest {
    private static Student studentKang;
    private static Student studentKim;
    private static Student studentShin;
    private static Student studentLee;
    private static Student studentHong;
    private static Subject subjectKorean;
    private static Subject subjectMath;
    private static Subject subjectDance;

    public static void main(String[] args) {
        addStudent();
        addSubject();
        addRegister();
        setScore();

        //System.out.println(studentKang);
        //System.out.println(subjectKorean.getGradeType());
        //System.out.println(subjectMath);

        subjectMath.printGrade();
        subjectKorean.printGrade();
        subjectDance.printGrade();
    }

    public static void addStudent() {
        studentKang = new Student(211213,"강감찬", "국어국문학과");
        studentKim = new Student(212330,"김유신", "컴퓨터공학과");
        studentShin = new Student(201518,"신사임당", "국어국문학과");
        studentLee = new Student(202360,"이순신", "국어국문학과");
        studentHong = new Student(201290,"홍길동", "컴퓨터공학과");
    }

    public static void addSubject() {
        subjectKorean = new Subject(1, "국어", 0);
        subjectMath = new Subject(2, "수학", 0);
        subjectDance = new Subject(3, "댄스", 2);
    }

    public static void addRegister() {
        subjectKorean.setStudentList(studentKang);
        subjectKorean.setStudentList(studentKim);
        subjectKorean.setStudentList(studentShin);
        subjectKorean.setStudentList(studentLee);
        subjectKorean.setStudentList(studentHong);
        subjectMath.setStudentList(studentKang);
        subjectMath.setStudentList(studentKim);
        subjectMath.setStudentList(studentShin);
        subjectMath.setStudentList(studentLee);
        subjectMath.setStudentList(studentHong);
        subjectDance.setStudentList(studentKang);
        subjectDance.setStudentList(studentKim);
        subjectDance.setStudentList(studentShin);
    }

    public static void setScore() {
        addScoreForStudent(studentKang, subjectKorean, 95);
        addScoreForStudent(studentKang, subjectMath, 56);
        addScoreForStudent(studentKang,subjectDance, 95);

        addScoreForStudent(studentKim, subjectKorean, 95);
        addScoreForStudent(studentKim, subjectMath, 98);
        addScoreForStudent(studentKim,subjectDance,85);

        addScoreForStudent(studentShin, subjectKorean, 100);
        addScoreForStudent(studentShin, subjectMath, 88);
        addScoreForStudent(studentShin,subjectDance, 55);

        addScoreForStudent(studentLee, subjectKorean, 89);
        addScoreForStudent(studentLee, subjectMath, 95);

        addScoreForStudent(studentHong, subjectKorean, 83);
        addScoreForStudent(studentHong, subjectMath, 56);
    }

    public static void addScoreForStudent(Student student, Subject subject, int point) {
        Score score = new Score(student.getStudentId() ,subject, point);
        student.setScoreList(score);
    }
}
