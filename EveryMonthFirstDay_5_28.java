package project2;

import java.util.Scanner;

public class EveryMonthFirstDay_5_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int year,month,day=1,h,q,m,j,k,firstDay;
		String[] week= {"Saturday","Sunday","Monday","Tuesday","Wednsday","Thursday","Friday"};
		String[] Month= {"January","February","Match","April","May","June","July","August","September","October","November","December"};
		
		System.out.print("输入年份: (e.g.,2012): ");
		year=input.nextInt();
		
		System.out.print("输入该年第一天是星期几: 1-7: ");
		firstDay=input.nextInt();
		
		for(month=1;month<=12;month++) {
			System.out.print(Month[month-1]+" 1, "+year+" is ");
			if(month<=2) {
				month+=12;
				year-=1;
			}
			j=(int) year/100;
			
			k=year%100;
			
			h=(day+26*(month+1)/10+k+k/4+j/4+5*j)%7;
			
			System.out.println(week[h]);
			if(month>12) {
				month-=12;
				year+=1;
			}
		}

	}

}
