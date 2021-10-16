package project2;

import java.util.Scanner;

public class DifferentLottery_5_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lottery1=(int)(Math.random()*10);
		int lottery2,lottery=0;
		for(;;) {
			lottery2=(int)(Math.random()*10);
			if(lottery2!=lottery1) {
				lottery=lottery1*10+lottery2;
				break;
			}
		}
		Scanner input=new Scanner(System.in);
		System.out.println("输入一个两位整数：");
		int guess=input.nextInt();

		int l=lottery,g=guess;
		int[] lotteryDigit=new int[2];
		int[] guessDigit=new int[2];
		int hit=0;
		for(int i=0;i<2;i++) {
			lotteryDigit[i]=lottery%10;
			lottery/=10;
		}
		for(int i=0;i<2;i++) {
			guessDigit[i]=guess%10;
			guess/=10;
		}
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				if(lotteryDigit[i]==guessDigit[j]) {
					hit++;
					break;
				}
			}
		}
		String n=String.format("%02d", l);
		System.out.println("彩票数字是："+n);
		if(g==l) {
			System.out.println("中奖了，奖金是$10,000");
		}else if(hit==2) {
			System.out.println("中奖了，奖金是$3,000");
		}else if(hit>=1) {
			System.out.println("中奖了，奖金是$1,000");
		}else {
			System.out.println("很遗憾，你没中奖");
		}
	}

}
