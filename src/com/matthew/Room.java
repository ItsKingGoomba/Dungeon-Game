package com.matthew;

public class Room {
	
	// Code Review: member variables should be prefixed by a "m_". Example: "m_roomName"
	private String m_roomName;
		
		public Room()
		{
			m_roomName = "Dark room";
		}
		
		String roomName(String aRoom)
		{
			m_roomName = aRoom;
			return m_roomName;
		}
	// Code Review: Where is the constuctor that initializes this Room?
	// When we create a room in the game world, we should supply it with a String name. That name should become the name of the room.
	// In other words, we need to create a constructor with a String parameter
	// Then set m_roomName to that parameter.
	// This is called variable initialization.
	// Read the following and implement a constructor that allows you to create a Room and give it a name.
	// http://www.homeandlearn.co.uk/java/class_constructor.html

	// Also, since m_roomName is a private member variable of Room, we need a way to get it from other classes (like Game)
	// In java, in order to do this, we use accessor/mutator methods, or getters and setters.
	// Read the following and implement a getter and a setter for the Room's name: 
	// http://stackoverflow.com/questions/2036970/how-do-getters-and-setters-work
}
