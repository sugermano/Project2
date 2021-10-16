package project2;

import java.util.Scanner;

public class Weekday_3_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int year,month,day,h,q,m,j,k;
		String[] week= {"Saturday","Sunday","Monday","Tuesday","Wednsday","Thursday","Friday"};
		System.out.print("Enter year: (e.g.,2012): ");
		year=input.nextInt();
		
		System.out.print("Enter month: 1-12: ");
		month=input.nextInt();
		
		System.out.print("Enter day: 1-31: ");
		day=input.nextInt();
		
		if(month<=2) {
			month+=12;
			year-=1;
		}
		j=(int) year/100;
		
		k=year%100;
		
		h=(day+26*(month+1)/10+k+k/4+j/4+5*j)%7;
		
		System.out.println("Day of the week is "+week[h]);
	}

}
