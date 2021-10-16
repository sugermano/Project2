package project2;

public class CalculatePI_5_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double PI=0;
		for(int j=1;j<=100000;j++) {
			PI+=(Math.pow((-1), j+1))/(2*j-1);
			if(j%10000==0) {
				System.out.printf("j = %d, PI = %f\n", j,4*PI);
			}
		}
	}

}
