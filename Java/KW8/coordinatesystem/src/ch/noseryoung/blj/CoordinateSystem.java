package ch.noseryoung.blj;
import java.util.ArrayList;
public class CoordinateSystem {
    int coordinateSystemSize;
    ArrayList<Shape> points = new ArrayList<>();
    public CoordinateSystem(ArrayList<Shape> points, int coordinateSystemSize) {
        this.coordinateSystemSize = coordinateSystemSize;
         this.points = points;
    }
    public int getCoordinateSystemSize() {
        return coordinateSystemSize;
    }

    public ArrayList<Shape> getPoints() {
        return points;
    }
}