package com.nikhil.adventuregame;

import java.util.HashMap;
import java.util.Map;

public class Location {
	private int locationId;
	private String description;
	private Map<String,Integer> exits; //This map holds the available exits from that location.
	
	public Location(int locationId,String description) {
		this.locationId=locationId;
		this.description=description;
		this.exits=new HashMap<>();
		exits.put("Q",0);
	}
	
	public boolean addExit(String direction,int location) {
		exits.put(direction,location);
		return true;
	}
	public int getLocationId() {
		return locationId;
	}
	public String getDescription() {
		return description;
	}
	public Map<String, Integer> getExits() {
		return new HashMap<String,Integer>(exits);  //making sure a copy of exits is returned.
	}

}
