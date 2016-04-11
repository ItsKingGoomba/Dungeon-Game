package com.matthew;

public class Room 
{	//member variable m_
	private String m_roomName;
		
	public Room(String roomName)
	{
		m_roomName = roomName;
	}

	public String GetRoomName() 
	{
		return m_roomName;
	}

	public void SetRoomName(String roomName) 
	{
		m_roomName = roomName;
	}
	private Monster m_roomMonster;
	
	public Monster GetRoomMonster()
	{
		return m_roomMonster;
	}
	
	public void SetRoomMonster(Monster roomMonster)
	{
		m_roomMonster = roomMonster;
	}
}
