package javapractice;

import java.util.Random;

public class rollTheDie {

	static int NUMBER_OF_PLAYER=1;
	static int INITIAL_POSITION=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getRoll();
	}

public static void getRoll() {
	Random ranNumber= new Random();
	int roll = (ranNumber.nextInt(6)+1);
	System.out.println(roll);
	}
}
