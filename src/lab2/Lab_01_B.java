/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2;
import java.util.*;
/**
 *
 * @author Nagat
 */
public class Lab_01_B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Step 2: ");
        Scanner input = new Scanner(System.in);
        System.out.print("How many quetions are on the final exam? ");
        int questions = input.nextInt();
        System.out.print("How many questions did the student miss? ");
        int missed = input.nextInt();
        System.out.println(new FinalExam(questions,missed));
        
        System.out.println("\nStep 3: ");
        System.out.print("How many quetions are on the final exam? ");
        questions = input.nextInt();
        System.out.print("How many questions did the student miss? ");
        missed = input.nextInt();
        System.out.print("What is the minimum passing score? ");
        double minPassingScore = input.nextInt();
        System.out.println(new PassFailExam(questions,missed,minPassingScore));
        
        System.out.println("\nStep 4: ");
        System.out.println("Term Paper:");
        System.out.print("Grammar points: ");
        double grammar = input.nextDouble();
        System.out.print("Spelling points: ");
        double spelling = input.nextDouble();
        System.out.print("Length points: ");
        double length = input.nextDouble();
        System.out.print("Content points: ");
        double content = input.nextDouble();
        Essay e1 = new Essay();
        e1.setScore(grammar, spelling, length, content);
        System.out.println(e1.toString());
        
        System.out.println("\nStep 5:");
        CourseGrades cG = new CourseGrades();
        GradedActivity gA = new GradedActivity();
        gA.setScore(85);
        cG.setLab(gA);
        PassFailExam pFE = new PassFailExam(20,3,70);
        cG.setPassFailExam(pFE);
        Essay e2 = new Essay();
        e2.setScore(20,15,20,25);
        cG.setEssay(e2);
        FinalExam fE = new FinalExam(50, 10);
        cG.setFinalExam(fE);
        System.out.println(cG);
        
        System.out.println("\nStep 6:");
        System.out.println(cG);
        System.out.printf("Average Score: %.1f\nHighest Score: %.1f\nLowest Score: %.1f\n",
                cG.getAverage(),cG.getHighest().getScore(),cG.getLowest().getScore());
        
        
    }
    
}