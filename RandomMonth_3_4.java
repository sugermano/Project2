package project2;

public class RandomMonth_3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int monthNum=(int)(Math.random()*12+1);
		String[] month= {"January","February","Match","April","May","June","July","August","September","October","November","December"};
		System.out.println("monthNum is "+monthNum+", and it's "+month[monthNum-1]);
	}

}
