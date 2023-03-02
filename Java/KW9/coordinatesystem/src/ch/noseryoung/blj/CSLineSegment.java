package ch.noseryoung.blj;

import java.awt.*;

public class CSLineSegment implements Shape{

    CSPoint point1;
    CSPoint point2;
    public CSLineSegment(CSPoint point1, CSPoint point2){
        this.point1 = point1;
        this.point2 = point2;
    }

    @Override
    public void draw(Graphics2D g2d, CoordinateSystem cs, int fieldscale) {
        CSPoint translatedPoint1 = translatePoint(cs, fieldscale, this.point1.x, this.point1.y);
        CSPoint translatedPoint2 = translatePoint(cs, fieldscale, this.point2.x, this.point2.y);
        g2d.setColor(Color.magenta);
        g2d.drawLine(point1.x, point1.y, point2.x, point2.y);
    }
}
