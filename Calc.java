package com.myowndev.main;

public class Calc {
	
	// This project based on this vid: https://www.youtube.com/watch?v=A4SPene9Yxw

	public static double v = 153.9; // 153.9 / 243.0 / 388.8 / 648.0 / 810.0
	public static double x;
	public static double y;
	public static double g = 9.80665;
	public static double teta;
	
	public static double x1 = 1394;
	public static double y1 = 1851;
	public static double x2 = 1286;
	public static double y2 = 1673;
	public static double q = 90; // 90/270
	
	public static double range;
	public static double alt_dif;
	public static double bear;
	public static double time;
	
	public static double A;
	public static double B;
	public static double H1 = 19;
	public static double H2 = 86;

	public Calc() {
		A = x1 - x2;
		B = y1 - y2;
		range = 10 * Math.sqrt(A * A + B * B);
		alt_dif = H1 - H2;
		
		x = range;
		y = alt_dif;
		
		teta = (1 / Math.tan(Math.toRadians(v * v + Math.sqrt((v * v * v * v - g * (g * (x * x) + 2 * y * (v * v))) / g * x))));
		time = x / (v * Math.cos(Math.toRadians(teta)));
		
		bear = q - (1 / Math.tan(Math.toRadians(B / A)));
		
		System.out.println("A = " + A);
		System.out.println("B = " + B);
		System.out.println("Range = " + range);
		System.out.println("alt_dif = " + alt_dif);
		System.out.println("Bear in rad = " + bear);
		System.out.println("Teta in rad = " + teta);
		System.out.println("Time = " + time);
	}
	
	public static void main(String [] weej) {
		new Calc();
	}

}







































