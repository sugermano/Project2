package project2;

public class PrintPyramid_5_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=8;
		for(int i=0;i<num;i++) {
			for(int j=0;j<2*num-1;j++) {
				if(j>=num-1-i&&j<=num-1) {
					System.out.printf("%4.0f",Math.pow(2,(j+i-num+1)));
				}else if(j<=num-1+i&&j>=num-1){
					System.out.printf("%4.0f",Math.pow(2,num-j+i-1));
				}else {
					System.out.printf("    ");
				}
			}
			System.out.printf("\n");
		}
	}

}
