package com;

public class Score {
    private int studentId;
    private Subject subject;
    private int score;

    public Score(int studentId, Subject subject, int score) {
        this.studentId = studentId;
        this.subject = subject;
        this.score = score;
    }

    public Subject getSubject() {
        return subject;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Score{" +
                "studentId=" + studentId +
                ", subject=" + subject +
                ", score=" + score +
                '}';
    }
}
