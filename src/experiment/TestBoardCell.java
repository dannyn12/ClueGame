package experiment;

import java.util.HashSet;
import java.util.Set;

public class TestBoardCell {
	private int column;
	private int row;
	private Set<TestBoardCell> adjacencyList;
	private boolean isRoom;
	private boolean isOccupied;
	
	public TestBoardCell(int column, int row) {
		super();
		this.column = column;
		this.row = row;
		this.adjacencyList = new HashSet<>();
		this.isRoom = false;
		this.isOccupied = false;
	}
	
	public void addAdjacency(TestBoardCell cell) {
		adjacencyList.add(cell);
	}
	
	Set<TestBoardCell> getAdjList() {
		return adjacencyList;
	}
	
	public void setRoom(boolean isRoom) {
		this.isRoom = isRoom;
	}

	public boolean isRoom() {
		return isRoom;
	}

	public void setOccupied(boolean isOccupied) {
		this.isOccupied = isOccupied;
	}
	
	public boolean isOccupied() {
		return isOccupied;
	}

}