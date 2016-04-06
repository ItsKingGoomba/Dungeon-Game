package com.matthew;

public class Main 
{

	public static void main(String[] args)
	{
		Game game = new Game();
		game.Start();
		
		Room room = new Room();
		String rName = room.roomName("Candy Room");
		System.out.println(rName);
		
		game.Run();
	}

}
