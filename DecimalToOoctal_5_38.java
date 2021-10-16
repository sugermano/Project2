package project2;

import java.util.Scanner;

public class DecimalToOoctal_5_38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("输入一个十进制整数：");
		int decimal=input.nextInt();
		
		String octal="";
		while(decimal>0) {
			octal+=decimal%8;
			decimal/=8;
		}
		StringBuffer strOctal=new StringBuffer(octal);

		System.out.println("其对应的八进制数为："+strOctal.reverse());
	}

}
