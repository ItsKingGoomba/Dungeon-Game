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
	
	public void Run()
	{
		while (m_isRunning)
		{
			Scanner input = new Scanner(System.in);
			String inputString = input.nextLine();
			System.out.println("Input: " + inputString);
		}
	}
	
}
