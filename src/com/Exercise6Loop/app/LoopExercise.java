package com.Exercise6Loop.app;



public class LoopExercise {

	public static void main(String[] args) {
		
		//Constant declaration
		
		//Variable declaration
		
		//Object declaration
		
		//Create a series of 1 to 100
		for (int i=0; i<=100; i++) {
			System.out.println(i);
			
		}
		
		//Creates a series of 100 to 1
		for (int i=100; i>=1; i--) {
			System.out.println(1);
		}
		
		//Creates a series in pair from 0 to 100
		for (int i=0; i<=100; i+=2) {
			System.out.println(i);
		}
		
		//Creates a series in pairs from 100 to 200
		for (int i=100; i<200; i++) {
			if(i%2==0) {
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("Displays half of the series ");
		
		for (int i=100; i<200; i++) {
			System.out.println(i);
			if(i==150) {
				break;
			}
		}
		
		
	}

}
