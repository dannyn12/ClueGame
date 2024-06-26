/* Room class contains information about each room in the game
 * Authors: Jordan Lam and Danny Nguyen
 * 
 */
package clueGame;

import java.util.ArrayList;
import java.util.List;

public class Room {
	private String name;
	private BoardCell centerCell;
	private BoardCell labelCell;
	private boolean hasSecretPassage;
	private List<BoardCell> doorList = new ArrayList<>(); // list of each door in the room
	private List<BoardCell> secretPassageList = new ArrayList<>(); // list of the secretpassage in the rom
	
 	
	// Constructors for Room
	public Room() {
		super();
	}
	
	public Room(String name, BoardCell centerCell, BoardCell labelCell) {
		this.name = name;
		this.centerCell = centerCell;
		this.labelCell = labelCell;
	}
	
	// Add door to door list of room
	public void addDoor(BoardCell door) {
		this.doorList.add(door);
	}
	
	
	/*
	 * Getters and setters
	 */
	public boolean hasSecretPassage() {
		return this.hasSecretPassage;
	}
	
	public void hasSecretPassage(boolean has) {
		this.hasSecretPassage = has;
	}
	
	public void addSecretPassage(BoardCell secretPassage) {
		this.secretPassageList.add(secretPassage);
	}
	
	public List<BoardCell> getSecretPassage(){
		return this.secretPassageList;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public BoardCell getCenterCell() {
		return centerCell;
	}
	
	public void setCenterCell(BoardCell centerCell) {
		this.centerCell = centerCell;
	}
	
	public BoardCell getLabelCell() {
		return labelCell;
	}
	
	public void setLabelCell(BoardCell labelCell) {
		this.labelCell = labelCell;
	}

	public List<BoardCell> getDoorList() {
		return doorList;
	}


	
	
}