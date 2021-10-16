package project2;

import java.util.Scanner;

public class PointInTheTriangle_3_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x,y;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a point's x- and y-coordinattes: ");
		x=input.nextDouble();
		y=input.nextDouble();
		
		if(x<=200&&x>=0&&y>=0&&y<=100&&y<=-0.5*x+100) {
			System.out.println("The Point("+x+", "+y+") is in the triangle.");
		}else {
			System.out.println("The Point("+x+", "+y+") is not in the triangle.");
		}
	}

}
