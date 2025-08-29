/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

/**
 *
 * @author 6305020
 */
public class PassFailExam extends PassFailActivity{
    private int numQuestions;
    private double pointsEach;
    private int numMissed;

    public PassFailExam(int numQuestions, int numMissed, double minPassingScore) {
        super(minPassingScore);
        this.numQuestions = numQuestions;
        this.pointsEach = 100 / numQuestions;
        this.numMissed = numMissed;
        setScore(100 - (numMissed * pointsEach));
    }

    public double getPointsEach() {
        return pointsEach;
    }

    public int getNumMissed() {
        return numMissed;
    }
    
    @Override
    public String toString() {
        return "Each question counts " + pointsEach + " points.\n" +
                "The exam score is " + getScore() + "\n"
                + "The Exam grade is " + getGrade();
    }
}
