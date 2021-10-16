package project2;

import java.util.Scanner;

public class TwoRectangles_3_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x1,y1,x2,y2,w1,h1,w2,h2;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter r1's center x-,y-coordinattes, width, and height: ");
		x1=input.nextDouble();
		y1=input.nextDouble();
		w1=input.nextDouble();
		h1=input.nextDouble();
		System.out.print("Enter r2's center x-,y-coordinattes, width, and height: ");
		x2=input.nextDouble();
		y2=input.nextDouble();
		w2=input.nextDouble();
		h2=input.nextDouble();
		
		double distX=Math.abs(x1-x2),distY=Math.abs(y1-y2);
		if(distX<=w1/2-w2/2 && distY<=h1/2-h2/2 ) {
			System.out.println("r2 is inside r1");
		}else if(distX>=w1/2+w2/2 && distY>=h1/2+h2/2) {
			System.out.println("r2 does not overlap r1");
		}else {
			System.out.println("r2 overlaps r1");
		}
	}

}
