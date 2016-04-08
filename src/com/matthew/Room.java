package com.matthew;

public class Room {
	
	private String m_roomName;
		
		public Room(String roomName)
		{
			this.SetRoomName(roomName);
		}

		public String GetRoomName() 
		{
			return m_roomName;
		}

		public void SetRoomName(String roomName) 
		{
			m_roomName = roomName;
		}
}
