package com.matthew;

import java.util.Scanner;

public class Game 
{
	private boolean m_isRunning; 
	
	public Game()
	{
		m_isRunning = false;
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
	
	public boolean ProcessInput(String input)
	{
		if (input.equals("quit"))
		{
			System.out.println("GoodBye");
			Stop();
			return true;
		}
		else if (input.equals("Attack"))
		{
			System.out.println("Ow that hurts");
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