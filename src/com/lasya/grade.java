package com.lasya;

public class grade {

	public static void main(String[] args) {
		int per = 100;
		
		String grade;
		if (per >= 90) {
			grade = "A";
		} else if (per >= 80 && per <= 89) {
			grade = "B";
		} else if (per >= 70 && per <= 79) {
			grade = "C";
		} else if (per >= 60 && per <= 69) {
			grade = "D";
		} else {
			grade = "F";
		}
	
	 System.out.println("you got " + per + "% your final grade is " + grade);
}}
