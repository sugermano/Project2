package project2;

public class Tuition_5_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double currentTuition=10000,totalTuition=0,everyTuition=0;
		double rate=0.05;
		everyTuition=currentTuition;
		for(int i=0;i<10;i++) {
			everyTuition=(1+rate)*everyTuition;
		}
		System.out.printf("10年后的学费为：%.2f\n",everyTuition);
		for(int i=0;i<4;i++) {
			everyTuition=(1+rate)*everyTuition;
			totalTuition+=everyTuition;
		}
		System.out.printf("10年后算起的4年内总学费为：%.2f\n",totalTuition);
	}

}
