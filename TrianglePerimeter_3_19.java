package project2;

import java.util.Scanner;

public class TrianglePerimeter_3_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("输入三角形的三条边：");
		Scanner input=new Scanner(System.in);
	
		double a=input.nextDouble();
		double b=input.nextDouble();
		double c=input.nextDouble();
		
		if(a+b<=c||a+c<=b||b+c<=a) {
			System.out.println("输入值不合法！");
		}else {
			System.out.println("边长为"+a+" "+b+" "+c+"的三角形的周长是 "+(a+b+c));
		}
		
	}

}
