package project2;

public class SelectCar3_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] SIZE= {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		String[] COLOR= {"Clubs","Diamonds","Hearts","Spades"};
		int size=(int)(Math.random()*13);
		int color=(int)(Math.random()*4);
		
		System.out.println("The Card you picked is "+SIZE[size]+" of "+COLOR[color]);
	}

}
