package project2;

import java.util.Scanner;

public class DecimalToOoctal_5_38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("����һ��ʮ����������");
		int decimal=input.nextInt();
		
		String octal="";
		while(decimal>0) {
			octal+=decimal%8;
			decimal/=8;
		}
		StringBuffer strOctal=new StringBuffer(octal);

		System.out.println("���Ӧ�İ˽�����Ϊ��"+strOctal.reverse());
	}

}
