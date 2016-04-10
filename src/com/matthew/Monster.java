package com.matthew;

public class Monster 
{
	private String m_monsterName;
	private int m_health;
	private int m_strength;
	
	public Monster(String monsterName, int health, int strength)
	{
		m_monsterName = monsterName;
		m_health = health;
		m_strength = strength;
	}

	public String getmonsterName() 
	{
		return m_monsterName;
	}

	public void setmonsterName(String monsterName) 
	{
		this.m_monsterName = monsterName;
	}

	public int gethealth() 
	{
		return m_health;
	}

	public void sethealth(int health) 
	{
		this.m_health = health;
	}

	public int getstrength()
	{
		return m_strength;
	}

	public void setstrength(int strength) 
	{
		this.m_strength = strength;
	}
}
