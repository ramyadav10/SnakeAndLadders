package javapractice;
import java.util.Random;

public class winningPosition{
//Variable are defined
static int NUMBER_OF_PLAYER=1;
static int PLAYER_SCORE=0;
static int rollDice;

public static void main(String[] args) {
	//Loop to check player position =100
	while(PLAYER_SCORE != 100) {
		getRoll();//calling function for rolling dice
		optionPlay();// calling function to check the optionPlay
	}
}

//Method for Rolling Dice
public static int getRoll() {
	Random ranNumber= new Random();
	rollDice = (ranNumber.nextInt(6)+1);
	return rollDice;
}

//Method to check for Option Play
public static void optionPlay() {
	Random opNumber= new Random();
	int optionNum = (opNumber.nextInt(3));

	if (optionNum == 2) {
		PLAYER_SCORE = PLAYER_SCORE + rollDice;
		System.out.println("Player position after getting Ladder: "+PLAYER_SCORE);	
	}else if(optionNum == 1) {
		PLAYER_SCORE = PLAYER_SCORE - rollDice;
			if (PLAYER_SCORE < 0) {
				PLAYER_SCORE=0;
			}
		System.out.println("Player position after getting Snake: "+PLAYER_SCORE);
	}else {
		System.out.println("Player position for No Play "+PLAYER_SCORE);
	}
}
}
