public class Edge {
    private int id;
    private Road road;

    public Edge(int id) {
        this.id = id;
    }

    public void placeRoad(Road r) {
        this.road = r;
    }
}
