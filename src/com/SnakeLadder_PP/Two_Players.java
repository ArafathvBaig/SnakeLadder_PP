package com.SnakeLadder_PP;

public class Two_Players 
{
	public static final int NO_PLAY = 0;
	public static final int LADDER = 1;
	public static final int SNAKE = 2;
	public static final int LOWER_LIMIT = 0;
	public static final int UPPER_LIMIT = 100;
	
	int position1 = 0;
	int dieCheck1;
	int optionCheck1;
	int roll1 = 0;
	
	int position2 = 0;
	int dieCheck2;
	int optionCheck2;
	int roll2 = 0;
	
	public void player1()
	{
			roll1=roll1+1;
			dieCheck1 = ((int)((Math.random())*10)%6)+1;
			optionCheck1 =(int) ((Math.random())*10)%3;
			switch(optionCheck1)
			{
			case NO_PLAY:
				position1=position1;
				break;
			case LADDER:
				if((position1+dieCheck1)>UPPER_LIMIT)
				{
					position1=position1;
				}
				else
				{
					position1=position1+dieCheck1;
				}
				break;
				
			default:
				
				if((position1-dieCheck1)<=LOWER_LIMIT)
				{
					position1=0;
				}
				else
				{
					position1=position1-dieCheck1;
				}
				break;
			}
			System.out.println("$$$$$$$$$$ PLAYER 1 $$$$$$$$$$");
			System.out.println("Dice Number of Player1: "+dieCheck1);
			System.out.println("No.of Times Die Rolles by Player1: "+roll1);
			System.out.println("Option for Player1: "+optionCheck1);
			System.out.println("The Position of Player1 is: "+position1);
			System.out.println(" ");
	}
	public void player2()
	{
		roll2=roll2+1;
		dieCheck2 = ((int)((Math.random())*10)%6)+1;
		optionCheck2 =(int) ((Math.random())*10)%3;
		switch(optionCheck2)
		{
		case NO_PLAY:
			position2=position2;
			break;
		case LADDER:
			if((position2+dieCheck2)>UPPER_LIMIT)
			{
				position2=position2;
			}
			else
			{
				position2=position2+dieCheck2;
			}
			break;
			
		default:
			
			if((position2-dieCheck2)<=LOWER_LIMIT)
			{
				position2=0;
			}
			else
			{
				position2=position2-dieCheck2;
			}
			break;
		}
		System.out.println("$$$$$$$$$$ PLAYER 2 $$$$$$$$$$");
		System.out.println("Dice Number of Player2: "+dieCheck2);
		System.out.println("No.of Times Die Rolles by Player2: "+roll2);
		System.out.println("Option for Player2: "+optionCheck2);
		System.out.println("The Position of Player2 is: "+position2);
		System.out.println(" ");
	}
	public void winner1()
	{
		if(position1==UPPER_LIMIT)
		{
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			System.out.println("Player 1 is the Winner");
			System.out.println("No.of Times Die Rolles by Player1: "+roll1);
			System.out.println("The Position of Player1 is: "+position1);
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		}
	}
	public void winner2()
	{
		if(position2==UPPER_LIMIT)
		{
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			System.out.println("Player 2 is the Winner");
			System.out.println("No.of Times Die Rolles by Player2: "+roll2);
			System.out.println("The Position of Player2 is: "+position2);
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			System.out.println(" ");
		}
	}
	
	
	public static void main(String[] args) 
	{
		Two_Players obj1 = new Two_Players();
		while((obj1.position1<UPPER_LIMIT) && (obj1.position2<UPPER_LIMIT))
		{
			obj1.player1();
			obj1.winner1();
			while(obj1.dieCheck1==6)
			{
				obj1.player1();
				obj1.winner1();
			}
			obj1.player2();
			obj1.winner2();
			while(obj1.dieCheck2==6)
			{
				obj1.player2();
				obj1.winner2();
			}
		}	
	}

}
