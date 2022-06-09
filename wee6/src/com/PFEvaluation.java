package com;

public class PFEvaluation implements Evaluation{
    @Override
    public String getScore(int score) {
        if (score >= 70) {
            return "P";
        }
        else {
            return "F";
        }
    }
}
