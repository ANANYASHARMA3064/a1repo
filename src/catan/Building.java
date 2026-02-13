package catan;

public class Building {
	private int victoryPoints;
	public Building(int victoryPoints){
		this.victoryPoints = victoryPoints;
	}

	public int getVictoryPoints(){
		return victoryPoints;
	}

	public void setVictoryPoints(int victoryPoints){
		this.victoryPoints = victoryPoints;
	}
}
