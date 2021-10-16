package project2;

public class ShowLeapYear_5_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int icount=0;
		for(int i=101;i<=2100;i++) {
			if(i%4==0&&i%100!=0||i%400==0) {
				icount++;
				System.out.print(i+" ");
				if(icount%10==0) {
					System.out.println();
				}
			}
		}
		System.out.println("\n从101年到2100年，有"+icount+"个闰年");
	}

}
