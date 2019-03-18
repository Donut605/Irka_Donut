package Calculation;

import java.util.Scanner;

public class Arithmetics {
	double s, a, b;
	public void Scan() {
		
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		System.out.println("¬ведите первое число:");
		a=scn.nextInt();
		System.out.println("¬ведите второе число: ");
		b=scn.nextInt();
	}
	
	public double add(double a, double b) {
		s=a+b;
		System.out.println("Cумма чисел:"+s);
		return s;
		
	}
	
	public double deduct(double a, double b) {
		return a-b;
	}
	
	public double mult(double a, double b) {
		return a*b;
	}
	
	public double div(double a, double b) {
		return a/b;
	}

}
