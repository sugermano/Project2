package project2;

import java.util.Scanner;

public class TrianglePerimeter_3_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���������ε������ߣ�");
		Scanner input=new Scanner(System.in);
	
		double a=input.nextDouble();
		double b=input.nextDouble();
		double c=input.nextDouble();
		
		if(a+b<=c||a+c<=b||b+c<=a) {
			System.out.println("����ֵ���Ϸ���");
		}else {
			System.out.println("�߳�Ϊ"+a+" "+b+" "+c+"�������ε��ܳ��� "+(a+b+c));
		}
		
	}

}
