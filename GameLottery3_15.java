package project2;

import java.util.Scanner;

public class GameLottery3_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lottery=(int)(Math.random()*1000);
		Scanner input=new Scanner(System.in);
		System.out.println("����һ����λ������");
		int guess=input.nextInt();

		int l=lottery,g=guess;
		int[] lotteryDigit=new int[3];
		int[] guessDigit=new int[3];
		int hit=0;
		for(int i=0;i<3;i++) {
			lotteryDigit[i]=lottery%10;
			lottery/=10;
		}
		for(int i=0;i<3;i++) {
			guessDigit[i]=guess%10;
			guess/=10;
		}
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(lotteryDigit[i]==guessDigit[j]) {
					hit++;
					break;
				}
			}
		}
		String n=String.format("%03d", l);
		System.out.println("��Ʊ�����ǣ�"+n);
		if(g==l) {
			System.out.println("�н��ˣ�������$10,000");
		}else if(hit==3) {
			System.out.println("�н��ˣ�������$3,000");
		}else if(hit>=1) {
			System.out.println("�н��ˣ�������$1,000");
		}else {
			System.out.println("���ź�����û�н�");
		}
		
	}

}
