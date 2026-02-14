
package catan;

/************************************************************/
/**
 * 
 */
public class Edge {
	/**
	 * 
	 */
	private int id;
	private Road road;

	public Edge(int id){
		this.id = id;
		this.road = null;
	}

	public int getId(){
        return id;
    }

	public boolean hasRoad(){
        return road != null;
    }
	/**
	 * 
	 * @param r 
	 */
	public void placeRoad(Road r) {
		if(road == null){
			this.road = r;
		}
		else{
			System.out.println("Edge already has a road.");
		}
	}

	public Road getRoad(){
		return road;
	}
}
