package project2;

import java.util.Scanner;

public class DecimalToBinary_5_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("����һ��ʮ����������");
		int decimal=input.nextInt();
		
		String binary="";
		while(decimal>0) {
			binary+=decimal%2;
			decimal/=2;
		}
		StringBuffer strBinary=new StringBuffer(binary);

		System.out.println("���Ӧ�Ķ�������Ϊ��"+strBinary.reverse());
	}

}
