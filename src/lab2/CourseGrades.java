/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

/**
 *
 * @author 6305020
 */
public class CourseGrades implements Analyzable{
    private GradedActivity[] grades;
    private final int NUM_GRADES = 4;
    
    public CourseGrades() {
        this.grades = new GradedActivity[NUM_GRADES];
    }
    
    @Override
    public double getAverage() {
        double avg = 0;
        
        for (int i = 0; i < grades.length; i++) {
            avg += grades[i].getScore();
        }
        
        return avg / grades.length;
    }
    
    @Override
    public GradedActivity getHighest() {
        
    }
    
    @Override
    public GradedActivity getLowest() {
        
    }
    
    public void setLab(GradedActivity lab) {
        grades[0] = lab;
    }
    
    public void setPassFailExam(PassFailExam exam) {
        grades[1] = exam;
    }
    
    public void setEssay(Essay essay) {
        grades[2] = essay;
    }
    
    public void setFinalExam(FinalExam finalExam) {
        grades[3] = finalExam;
    }

    @Override
    public String toString() {
        return "CourseGrades{" + "grades=" + grades + ", NUM_GRADES=" + NUM_GRADES + '}';
    }
}
