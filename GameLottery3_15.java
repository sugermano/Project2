package project2;

import java.util.Scanner;

public class GameLottery3_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lottery=(int)(Math.random()*1000);
		Scanner input=new Scanner(System.in);
		System.out.println("输入一个三位整数：");
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
		System.out.println("彩票数字是："+n);
		if(g==l) {
			System.out.println("中奖了，奖金是$10,000");
		}else if(hit==3) {
			System.out.println("中奖了，奖金是$3,000");
		}else if(hit>=1) {
			System.out.println("中奖了，奖金是$1,000");
		}else {
			System.out.println("很遗憾，你没中奖");
		}
		
	}

}
