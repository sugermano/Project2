package project2;

import java.util.Scanner;

public class ISBN_10Check_3_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intNum=0;
		int[] num=new int[10];
		int d10=0;
		int d=0;
		System.out.println("输入9个整数：");
		Scanner input=new Scanner(System.in);
		intNum=input.nextInt();
		d=intNum;
		//数据处理
		for(int i=8;i>=0;i--) {
			num[i]=d%10;
			d=d/10;
			d10+=num[i]*(i+1);
		}
		d10=d10%11;
		//格式化输出整数0补齐
		String n=String.format("%09d", intNum);
		if(d10==10) {
			System.out.println("ISBN-10 数是 "+n+"X");
		}else {
			System.out.println("ISBN-10 数是 "+n+d10);
		}
		
	}

}
