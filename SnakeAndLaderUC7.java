package javapractice;
import java.util.Random;

public class twoPlayerGame{
//Variable are defined
static int PLAYER1=0;
static int PLAYER2=0;
static int rollDice;
static int count=0;
static int currentPlayer=-1;
static int PLAYER;

public static void main(String[] args) {
	//Loop to check player winning position=100
	while(PLAYER != 100) {
		getRoll();//calling function for rolling dice
		//Condition for switching between player alternative turn
		if (currentPlayer == -1) {
			PLAYER1=startGame(PLAYER1,rollDice);//Calling the method to start game for player-1.
			System.out.println("Player1 position is :"+PLAYER1);
		}else {
			PLAYER2=startGame(PLAYER2,rollDice);//Calling the method to start game for player-2.
			System.out.println("Player2 position is"+PLAYER2);

		}
		currentPlayer=-currentPlayer;//switching player position

	}
	System.out.println("Total count is :"+count);//Total no. of time dice is rolled.
}

//Method for Rolling Dice
public static int getRoll() {
	Random ranNumber= new Random();
	rollDice = (ranNumber.nextInt(6)+1);
	count++;//Count the number of time die is roll
	return rollDice;
}

//Method to check for Option Play
public static int startGame(int playerScore,int rollDice ){
	PLAYER=playerScore;
	Random opNumber= new Random();
	int optionNum = (opNumber.nextInt(3));//Check the option play for each roll

	if (optionNum == 2) {
		//LADDER OPTION
		PLAYER =PLAYER + rollDice;
		if (PLAYER >= 100){
			PLAYER =100;
		}
	}else if(optionNum == 1) {
		//SNAKE OPTION
		PLAYER =PLAYER - rollDice;
		if (PLAYER < 0) {
			PLAYER =0;
		}
	}else {
	//NO PLAY
	}
return PLAYER;
}
}
