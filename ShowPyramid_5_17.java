package project2;

import java.util.Scanner;

public class ShowPyramid_5_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of lines: ");
		num=input.nextInt();
		for(int i=0;i<num;i++) {
			for(int j=0;j<2*num-1;j++) {
				if(j>=num-1-i&&j<=num-1) {
					System.out.printf("%3d",num-j);
				}else if(j<=num-1+i&&j>=num-1){
					System.out.printf("%3d",j-num+2);
				}else {
					System.out.printf("   ");
				}
			}
			System.out.printf("\n");
		}
	}

}
