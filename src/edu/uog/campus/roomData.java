package edu.uog.campus;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class roomData {

	@SuppressWarnings("resource")
	public static List<Room> findAll()  {
		List<Room> rooms = new ArrayList<Room>();
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader(Room.csvFile));
			
			while ((line = bufferreader.readLine()) != null) {
				Room room = new Room();
				
				String[] roomRow = line.split(",");
				
				room.setROOM_ID(Integer.parseInt(roomRow[0]));
				room.setROOM_NAME(roomRow[1]);
				room.setROOM_FLOOR(Integer.parseInt(roomRow[2]));
				room.setROOM_CAPACITY(Integer.parseInt(roomRow[3]));
				room.setROOM_TYPE(roomRow[4]);
				
				rooms.add(room);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rooms;
	}
	@SuppressWarnings("resource")
	public static Room findOne(int room_ID)  {
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader(Room.csvFile));
			
			while ((line = bufferreader.readLine()) != null) {
				Room room = new Room();
				
				String[] roomRow = line.split(",");
				
				if (Integer.parseInt(roomRow[0]) == room_ID) {
					room.setROOM_ID(Integer.parseInt(roomRow[0]));
					room.setROOM_NAME(roomRow[1]);
					room.setROOM_FLOOR(Integer.parseInt(roomRow[2]));
					room.setROOM_CAPACITY(Integer.parseInt(roomRow[3]));
					
					room.setROOM_TYPE(roomRow[4]);
					
					
					return room;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@SuppressWarnings("resource")
	public static Room deleteOne(int room_ID)  {
		FileWriter filewriter;

		List<Room> rooms = findAll();
		Room room = findOne(room_ID);

		try {
			filewriter = new FileWriter(Room.csvFile);

			for (int i=0; i<rooms.size(); i++) {
				if (rooms.get(i).getROOM_ID() != room_ID) {
					filewriter.append(rooms.get(i).toString());
					filewriter.append("\n");
				}
			}
			filewriter.flush();
			filewriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return room;
	}

	@SuppressWarnings("resource")
	public static List<Room> search(String search)  {
		List<Room> rooms = new ArrayList<Room>();
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader(Room.csvFile));
			
			while ((line = bufferreader.readLine()) != null) {
				Room room = new Room();
				
				String[] roomRow = line.split(",");
				
				if (roomRow[1].contains(search) == true) {
					room.setROOM_ID(Integer.parseInt(roomRow[0]));
					room.setROOM_NAME(roomRow[1]);
					room.setROOM_FLOOR(Integer.parseInt(roomRow[2]));
					room.setROOM_CAPACITY(Integer.parseInt(roomRow[3]));
					room.setROOM_TYPE(roomRow[4]);
					
					rooms.add(room);
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rooms;
	}

	@SuppressWarnings("resource")
	public static Room deleteOne1(int room_ID)  {
		FileWriter filewriter;

		List<Room> rooms = findAll();
	Room room = findOne(room_ID);

		try {
			filewriter = new FileWriter(room.csvFile);

			for (int i=0; i<rooms.size(); i++) {
				if (rooms.get(i).getROOM_ID() != room_ID) {
					filewriter.append(rooms.get(i).toString());
					filewriter.append("\n");
				}
			}
			filewriter.flush();
			filewriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return room;
	}
	
	
	@SuppressWarnings("resource")
	public static Room Save(Room Room) {
		FileWriter filewriter;

		List<Room> Rooms = findAll();

		try {
			filewriter = new FileWriter(Room.csvFile);

			for (int i=0; i<Rooms.size(); i++) {
				filewriter.append(Rooms.get(i).toString());
				filewriter.append("\n");
			}
			if (Rooms.size()>0)
				Room.setROOM_ID(Rooms.get(Rooms.size()-1).getROOM_ID()+1);
			else
				Room.setROOM_ID(1);
			filewriter.append(Room.toString());
			filewriter.append("\n");
			filewriter.flush();
			filewriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block

			
			e.printStackTrace();
		}
		
		
		
		return Room;
	}
	
}