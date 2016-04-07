package com.matthew;

public class Main 
{

	public static void main(String[] args)
	{
		Game game = new Game();
		game.Start();
		
		Room room = new Room("Candy room");
		System.out.println(room.getM_roomName());
		
		game.Run();
	}

}
