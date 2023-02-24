package ch.noseryoung.blj;
import java.lang.reflect.Array;
import java.util.ArrayList;
public class CoordinateSystem {
    ArrayList<CSPoint> listPoints = new ArrayList<>();
    ArrayList<CSLineSegment> listLines = new ArrayList<>();
    int coordinateSystemSize;
    public CoordinateSystem(ArrayList<CSPoint> points, int coordinateSystemSize) {
        this.coordinateSystemSize = coordinateSystemSize;
        listPoints = points;
    }
    public int getCoordinateSystemSize() {
        return coordinateSystemSize;
    }
    public ArrayList<CSPoint> getAllPoints() {
        return listPoints;
    }

    public ArrayList<CSLineSegment> getListLines() {
        return listLines;
    }
}