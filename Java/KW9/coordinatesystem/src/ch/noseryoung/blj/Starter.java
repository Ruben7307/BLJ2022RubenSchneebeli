package ch.noseryoung.blj;

import java.util.ArrayList;

public class Starter {
    
    public static void main(String[] args) {

        ArrayList<Shape> everything = new ArrayList<>();
        CoordinateSystem cs = new CoordinateSystem(everything, 1000);





        CSPoint csPoint0 = new CSPoint(100, 100);
        CSPoint csPoint1 = new CSPoint(350, 200);
        CSPoint csPoint2 = new CSPoint(300, 300);
        CSPoint csPoint3 = new CSPoint(500, 500);
        CSPoint csPoint4 = new CSPoint(100, 40);
        CSPoint csPoint5 = new CSPoint(-200, -200);

        CSPoint csPoint6 = new CSPoint(0, -300);
        CSPoint csPoint7 = new CSPoint(0, -20);
        CSPoint csPoint8 = new CSPoint(100, -300);
        CSPoint csPoint9 = new CSPoint(100, -20);



        CSLineSegment line = new CSLineSegment(csPoint1, csPoint4);
        CSLineSegment line1 = new CSLineSegment(csPoint4, csPoint2);
        CSLineSegment line2 = new CSLineSegment(csPoint2, csPoint1);

        CSLineSegment line3 = new CSLineSegment(csPoint6, csPoint7);
        CSLineSegment line4 = new CSLineSegment(csPoint9, csPoint7);
        CSLineSegment line5 = new CSLineSegment(csPoint8, csPoint9);
        CSLineSegment line6 = new CSLineSegment(csPoint8, csPoint6);


        everything.add(csPoint0);
        everything.add(csPoint1);
        everything.add(csPoint2);
        everything.add(csPoint3);
        everything.add(csPoint4);
        everything.add(csPoint5);

        everything.add(line);
        everything.add(line1);
        everything.add(line2);
        everything.add(line3);
        everything.add(line4);
        everything.add(line5);
        everything.add(line6);

        CSRenderer c = new CSRenderer(cs);
    }
}
