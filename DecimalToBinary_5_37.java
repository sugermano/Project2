package project2;

import java.util.Scanner;

public class DecimalToBinary_5_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("输入一个十进制整数：");
		int decimal=input.nextInt();
		
		String binary="";
		while(decimal>0) {
			binary+=decimal%2;
			decimal/=2;
		}
		StringBuffer strBinary=new StringBuffer(binary);

		System.out.println("其对应的二进制数为："+strBinary.reverse());
	}

}
