package ch.noseryoung.blj;

import java.util.ArrayList;

public class Starter {
    public static void main(String[] args) {
        ArrayList<CSPoint> allpoints = new ArrayList<>();
        CoordinateSystem cs = new CoordinateSystem(allpoints, 1000);
        ArrayList<CSLineSegment> lines = cs.getListLines();

        CSPoint csPoint = new CSPoint(100, 100);
        CSPoint csPoint1 = new CSPoint(350, 200);
        CSPoint csPoint2 = new CSPoint(300, 300);
        CSPoint csPoint3 = new CSPoint(500, 500);
        CSPoint csPoint4 = new CSPoint(100, 40);
        CSPoint csPoint5 = new CSPoint(-200, -200);


        CSLineSegment line = new CSLineSegment(csPoint1, csPoint4);
        CSLineSegment line1 = new CSLineSegment(csPoint4, csPoint2);
        CSLineSegment line2 = new CSLineSegment(csPoint2, csPoint1);

        allpoints.add(csPoint);
        allpoints.add(csPoint1);
        allpoints.add(csPoint2);
        allpoints.add(csPoint3);
        allpoints.add(csPoint4);
        allpoints.add(csPoint5);

        lines.add(line);
        lines.add(line1);
        lines.add(line2);

        CSRenderer c = new CSRenderer(cs);
    }
}
