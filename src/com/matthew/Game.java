package com.matthew;

import java.util.Scanner;

public class Game 
{
	private boolean m_isRunning; 
	private Room m_room;
	private Monster m_goblin;
	
	public Game()
	{
		m_isRunning = false;
		m_room = new Room("Candy room");
		System.out.println(m_room.GetRoomName());
		
		m_goblin = new Monster("Big Goblin",10,5);
		m_room.SetRoomMonster(m_goblin);
		System.out.println(m_room.GetRoomMonster().GetMonsterName());	
	}
	
	public void Start()
	{
		m_isRunning = true;
	}
	
	public void Stop()
	{
		m_isRunning = false;
	}
	
	public void Run()
	{
		while (m_isRunning)
		{
			Scanner input = new Scanner(System.in);
			String inputString = input.nextLine();
			if (ProcessInput(inputString))
			{
				
			}
			else
			{
				System.out.println("Can not compute");
			}
		}
	}
	//Game commands to do things
	public boolean ProcessInput(String input)
	{
		if (input.equals("quit"))
		{
			System.out.println("GoodBye");
			Stop();
			return true;
		}
		//when attack command print monster health
		else if (input.equals("Attack"))
		{
			System.out.println(m_room.GetRoomMonster().GetHealth());
			return true;
		}
		else if (input.equals("move"))
		{
			System.out.println("You moved to the East");
			return true;
		}
		else if (input.equals("loot"))
		{
			System.out.println("You found a shiny penny");
			return true;
		}
		return false;
	}
}