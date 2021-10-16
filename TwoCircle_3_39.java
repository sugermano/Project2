package project2;

import java.util.Scanner;

public class TwoCircle_3_39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x1,y1,x2,y2,r1,r2;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter circle1's center x-,y-coordinattes, and radius: ");
		x1=input.nextDouble();
		y1=input.nextDouble();
		r1=input.nextDouble();
		System.out.print("Enter circle2's center x-,y-coordinattes, and radius: ");
		x2=input.nextDouble();
		y2=input.nextDouble();
		r2=input.nextDouble();
		
		double distR=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		if(distR<=r1-r2) {
			System.out.println("circle2 is inside circle1");
		}else if(distR>=r1+r2) {
			System.out.println("circle2 does not overlap circle1");
		}else {
			System.out.println("circle2 overlaps circle1");
		}
	}

}
