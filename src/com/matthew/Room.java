package com.matthew;

public class Room {
	
	private String m_roomName;
		
		public Room(String m_roomName)
		{
			this.setM_roomName("Dark room");
		}

		public String getM_roomName() 
		{
			return m_roomName;
		}

		public void setM_roomName(String m_roomName) 
		{
			this.m_roomName = m_roomName;
		}
}
