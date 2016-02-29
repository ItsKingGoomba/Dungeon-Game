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
				System.out.println("This is wrong");
			}
		}
	}
	
	public boolean ProcessInput(String input)
	{
		if (input.equals("quit"))
		{
			Stop();
			return true;
		}
		
		return false;
	}
}