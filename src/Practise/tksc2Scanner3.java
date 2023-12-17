package Practise;

/*
Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine the grade based on the following rules:
if the average score >=90 → grade=A
if the average score >= 70 and <90 → grade=B
if the average score>=50 and <70 → grade=C
if the average score<50 → grade=F
 */

import java.util.Scanner;

public class tksc2Scanner3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double quiz, midTerm, finalScores, avgScores;
        char grade;
        System.out.println("Enter quiz scores:");
        quiz =sc.nextDouble();
        System.out.println("Enter mid term scores:");
        midTerm = sc.nextDouble();
        System.out.println("Enter final scores:");
        finalScores = sc.nextDouble();
        avgScores = (quiz+midTerm+finalScores)/3;

        if (avgScores >= 90) {
            grade = 'A';
        } else if (avgScores >= 70 && avgScores < 90) {
            grade = 'B';
        } else if (avgScores >= 50 && avgScores < 70) {
            grade = 'C';

        }else {
            grade = 'F';
        }
        System.out.println(grade);

    }
}
