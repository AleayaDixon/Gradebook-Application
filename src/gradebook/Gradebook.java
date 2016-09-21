/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradebook;
import java.util.Scanner;
/**
 *
 * @author Aleaya
 */
public class Gradebook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int mainCounter = 0;
        int mCounter = 0;
        int fCounter = 0;
        int eCounter = 0;
        int csCounter = 0;
        int eeCounter = 0;
        int mdCounter = 0;
        int dcCounter = 0;
        int vaCounter = 0;
        Scanner keyboard = new Scanner(System.in);
        String fname;
        String lname;
        String grade;
        String gen;
        String maj;
        String state;
        int score;
        String command;
        String command2;
        int sum = 0;
        int sumGm = 0;
        int sumGf = 0;
        int sumE = 0;
        int sumCs = 0;
        int sumEe = 0;
        int sumMd = 0;
        int sumDc = 0;
        int sumVa = 0;
        int avgO;
        int avgGm;
        int avgGf;
        int avgE;
        int avgCs;
        int avgEe;
        int avgMd;
        int avgDc;
        int avgVa;
        System.out.print("Please insert \"input\" to begin.");
        command = keyboard.next();


        while (command.equals("input"))
        {
        System.out.println("Please enter the student’s first and last name, letter grade, gender (M or F), major abbreviation, state abbreviation, and numerical score.");
        fname = keyboard.next();
        lname = keyboard.next();
        grade = keyboard.next();
        gen = keyboard.next();
        maj = keyboard.next();
        state = keyboard.next();
        score = keyboard.nextInt();
        sum = sum + score;
        mainCounter +=1;
        if (gen.equals("M"))
        {
                mCounter +=1;
                sumGm = sumGm + score;
        }
        else
        {
                fCounter +=1;
                sumGf = sumGf + score;
        }
        if(maj.equals("Econ"))
        {
                eCounter+=1;
                sumE = sumE + score;
        }
        else if(maj.equals("CompSci"))
        {
                csCounter +=1;
                sumCs = sumCs + score;
        }
        else
        {
                eeCounter +=1;
                sumEe = sumEe + score;
        }
        if(state.equals("MD"))
        {
                mdCounter +=1;
                sumMd = sumMd + score;
        }
        else if(state.equals("DC"))
        {
                dcCounter +=1;
                sumDc = sumDc + score;
        }
        else
        {
                vaCounter +=1;
                sumVa = sumVa + score;
        }
        System.out.print("Would you like to \"input\" more names or make a \"calculation\"?");
        command = keyboard.next();
        if (command.equals("calculation"))
        {
                System.out.print("Would you like to get the \"overal1\" average, average by \"gender\", the average by \"major\", the average by \"state\", or \"all\" of the above?");
                command2 = keyboard.next();
                if(command2.equals("overall"))
                {
                        avgO = sum/mainCounter;
                        System.out.println("The overall average score is " + avgO);
                        System.out.println("There are " + mainCounter + " student(s).");
                }
                else if(command2.equals("gender"))
                {
                        if(mCounter > 0)
                        {
                          avgGm = sumGm/mCounter; 
                          System.out.println("The average score for males is " + avgGm); 
                          
                        }
                        if(fCounter > 0)
                        {
                        avgGf = sumGf/fCounter;
                        System.out.println("The average score for females is " + avgGf); 
                        
                        }
                      System.out.println("There are " + mainCounter + " student(s).");  
                }
                else if(command2.equals("major"))
                {
                        if(eCounter >0)
                        {
                         avgE = sumE/eCounter;
                         System.out.println("The average score for Econ majors is " + avgE);
                         
                        }
                        if(csCounter > 0)
                        {
                          avgCs = sumCs/csCounter;
                          System.out.println("The average score for CompSci majors is " + avgCs); 
                          
                        }
                        if(eeCounter > 0)
                        {
                        avgEe = sumEe/eeCounter;
                        System.out.println("The average score for EE majors is " + avgEe);
                        
                        }
                      System.out.println("There are " + mainCounter + " student(s).");  
                }
                else if(command2.equals("state"))
                {
                        if(mdCounter > 0)
                        {
                        avgMd = sumMd/mdCounter;
                        System.out.println("The average score for Maryland residents is " + avgMd);
                        }
                        if(dcCounter > 0)
                        {
                         avgDc = sumDc/dcCounter;
                         System.out.println("The average score for DC residents is " + avgDc);
                        }
                        if(vaCounter > 0)
                        {
                        avgVa = sumVa/vaCounter;
                        System.out.println("The average score for Virginia residents is " + avgVa);  
                        }
                        System.out.println("There are " + mainCounter + " student(s).");
                }
                else
                {
                        if(mCounter > 0)
                        {
                          avgGm = sumGm/mCounter; 
                          System.out.println("The average score for males is " + avgGm); 
                          
                        }
                        if(fCounter > 0)
                        {
                        avgGf = sumGf/fCounter;
                        System.out.println("The average score for females is " + avgGf); 
                        
                        }
                        if(eCounter >0)
                        {
                         avgE = sumE/eCounter;
                         System.out.println("The average score for Econ majors is " + avgE);
                         
                        }
                        if(csCounter > 0)
                        {
                          avgCs = sumCs/csCounter;
                          System.out.println("The average score for CompSci majors is " + avgCs); 
                          
                        }
                        if(eeCounter > 0)
                        {
                        avgEe = sumEe/eeCounter;
                        System.out.println("The average score for EE majors is " + avgEe);
                        
                        }
                        System.out.println("There are " + mainCounter + " student(s).");
                }
                if(mdCounter > 0)
                        {
                        avgMd = sumMd/mdCounter;
                        System.out.println("The average score for Maryland residents is " + avgMd);
                        }
                        if(dcCounter > 0)
                        {
                         avgDc = sumDc/dcCounter;
                         System.out.println("The average score for DC residents is " + avgDc);
                        }
                        if(vaCounter > 0)
                        {
                        avgVa = sumVa/vaCounter;
                        System.out.println("The average score for Virginia residents is " + avgVa);  
                        }
        }


        }
    }
    
}
