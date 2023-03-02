package ch.noseryoung.blj;

import java.awt.*;

public class CSPoint extends Point implements Shape {
    private int IDPoint = 0;
    static int IDCounter = 0;
    private CSPoint postition;

    public CSPoint(int x, int y) {
        this.x = x;
        this.y = y;
        this.IDPoint = IDCounter;
        IDCounter++;
    }

    public CSPoint() {

    }

    @Override
    public String toString() {
        return "[id = " + IDPoint + ", x = " + x + ", y = " + y + "]";
    }


    @Override
    public void draw(Graphics2D g2d, CoordinateSystem cs, int fieldscale) {
        CSPoint translatedPoint = translatePoint(cs, fieldscale, this.x, this.y);
        g2d.setColor(Color.BLUE);
        g2d.drawLine(translatedPoint.x, translatedPoint.y, translatedPoint.x, translatedPoint.y);
    }
}
