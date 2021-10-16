package project2;

import java.util.Scanner;

public class PointInTheRect_3_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x,y;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a point with two coordinattes: ");
		x=input.nextDouble();
		y=input.nextDouble();
		
		if(x>=-5&&x<=5&&y>=-2.5&&y<=2.5) {
			System.out.println("Point("+x+", "+y+") is in the rectangle.");
		}else {
			System.out.println("Point("+x+", "+y+") is not in the rectangle.");
		}
		
	}

}
