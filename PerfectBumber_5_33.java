package project2;

public class PerfectBumber_5_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total=0;
		System.out.print("10000以内的完全数有： ");
		for(int i=1;i<10000;i++) {
			total=0;
			for(int j=1;j<i;j++) {
				if(i%j==0) {
					total+=j;
				}
			}
			if(total==i) {
				System.out.print(i+", ");
			}
		}
	}

}
