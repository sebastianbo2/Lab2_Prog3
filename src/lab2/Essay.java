/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

/**
 *
 * @author 6305020
 */
public class Essay extends GradedActivity{
    private double grammer;
    private double spelling;
    private double correctLength;
    private double content;
    
    public void setScore(double grammer, double spelling, double correctLength, double content) {
        super.setScore(grammer + spelling + correctLength + content);
    }
    
    public double getGrammer() {
        return grammer;
    }

    public void setGrammer(double grammer) {
        this.grammer = grammer;
    }

    public double getSpelling() {
        return spelling;
    }

    public void setSpelling(double spelling) {
        this.spelling = spelling;
    }

    public double getCorrectLength() {
        return correctLength;
    }

    public void setCorrectLength(double correctLength) {
        this.correctLength = correctLength;
    }

    public double getContent() {
        return content;
    }

    public void setContent(double content) {
        this.content = content;
    }
    
    @Override
    public String toString() {
        return "Total points: " + getScore() + "\n"
                + "Grade: " + getGrade();
    }
}
