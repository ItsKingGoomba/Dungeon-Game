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

	public String GetMonsterName() 
	{
		return m_monsterName;
	}

	public void SetMonsterName(String monsterName) 
	{
		m_monsterName = monsterName;
	}

	public int GetHealth() 
	{
		return m_health;
	}

	public void SetHealth(int health) 
	{
		m_health = health;
	}

	public int GetStrength()
	{
		return m_strength;
	}

	public void SetStrength(int strength) 
	{
		m_strength = strength;
	}
}
