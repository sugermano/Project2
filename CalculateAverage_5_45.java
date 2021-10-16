package project2;

import java.util.Scanner;

public class CalculateAverage_5_45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] nums=new double[10];
		double total=0,t1=0;
		System.out.println("ÊäÈë10¸öÊı£º");
		Scanner input=new Scanner(System.in);
		
		for(int i=0;i<10;i++) {
			nums[i]=input.nextDouble();
			total+=nums[i];
			t1+=nums[i]*nums[i];
		}
		
		double avg=total/10;
		double deviation=Math.sqrt((t1-total*total/10)/9);
		
		System.out.printf("The mean is %.2f\n",avg);
		System.out.printf("The standard deviation is %.5f",deviation);
	}

}
