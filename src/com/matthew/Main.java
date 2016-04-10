package com.matthew;

public class Main 
{

	public static void main(String[] args)
	{
		Game game = new Game();
		game.Start();
		
		Room room = new Room("Candy room");
		System.out.println(room.GetRoomName());
		
		Monster goblin = new Monster("Big Goblin",10,5);
		System.out.println(goblin.getmonsterName());
		System.out.println(goblin.gethealth());
		System.out.println(goblin.getstrength());
		
		game.Run();
	}

}
