package ch.noseryoung.blj;

import java.awt.*;

public interface Shape {

    void draw(Graphics2D g2d, CoordinateSystem cs, int fieldscale);
    default CSPoint translatePoint(CoordinateSystem cs, int fieldScale, int x, int y) {
        return new CSPoint(x * fieldScale + (cs.getCoordinateSystemSize() * fieldScale) / 2, (cs.getCoordinateSystemSize() * fieldScale) / 2 - y * fieldScale);
    }
}
