package ch.noseryoung.blj;

import java.util.ArrayList;

public class Starter {
    
    public static void main(String[] args) {

        ArrayList<Shape> everything = new ArrayList<>();
        CoordinateSystem cs = new CoordinateSystem(everything, 1000);





        CSPoint csPoint = new CSPoint(100, 100);
        CSPoint csPoint1 = new CSPoint(350, 200);
        CSPoint csPoint2 = new CSPoint(300, 300);
        CSPoint csPoint3 = new CSPoint(500, 500);
        CSPoint csPoint4 = new CSPoint(100, 40);
        CSPoint csPoint5 = new CSPoint(-200, -200);


        CSLineSegment line = new CSLineSegment(csPoint1, csPoint4);
        CSLineSegment line1 = new CSLineSegment(csPoint4, csPoint2);
        CSLineSegment line2 = new CSLineSegment(csPoint2, csPoint1);

        everything.add(csPoint);
        everything.add(csPoint1);
        everything.add(csPoint2);
        everything.add(csPoint3);
        everything.add(csPoint4);
        everything.add(csPoint5);

        everything.add(line);
        everything.add(line1);
        everything.add(line2);

        CSRenderer c = new CSRenderer(cs);
    }
}
