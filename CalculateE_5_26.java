package project2;

public class CalculateE_5_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double E=1;
		double item=1;
		for(int i=1;i<=100000;i++) {
			item=item/i;
			E+=item;
			if(i%10000==0) {
			System.out.printf("i = %d, e = %f\n", i,E);
			}
		}
	}

}
