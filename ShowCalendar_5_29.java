package project2;

import java.util.Scanner;

public class ShowCalendar_5_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int year,month,day=1,h,q,m,j,k,firstDay;
		int Sun=0,Mon=0,Tue=0,Wed=0,Thu=0,Fri=0,Sat=0;
		int[] week=new int[7];
		String[] Month= {"January","February","Match","April","May","June","July","August","September","October","November","December"};
		int[][] MonthOfDay= {{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
							{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}};
		int isLeapYear=0;
		int icount=0;
		System.out.print("補秘定芸: (e.g.,2012): ");
		year=input.nextInt();
		
		System.out.print("補秘乎定及匯爺頁佛豚叱: 1-7: ");
		firstDay=input.nextInt();
		if(year%4==0&&year%100!=0||year%400==0) isLeapYear=1;
		
		for(month=1;month<=12;month++) {
			m=month;
			System.out.println("\n          "+Month[month-1]+" "+year+"          ");
			System.out.println("！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！");
			System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat");
			if(month<=2) {
				month+=12;
				year-=1;
			}
			j=(int) year/100;
			
			k=year%100;
			icount=0;
			for(day=1;day<=MonthOfDay[isLeapYear][m-1];day++) {
				icount++;
				h=(day+26*(month+1)/10+k+k/4+j/4+5*j)%7;
				if(h==0) h=7;
				h--;
				week[h]=day;//week[2]=1
				if(day==1) {
					for(int p=0;p<h;p++) {
						icount++;
						System.out.print("      ");
					}
				}
				System.out.printf("%2d    ",day);
				if(icount%7==0) {
					System.out.println();
				}
			}
			if(month>12) {
				month-=12;
				year+=1;
			}
		}
	}

}
