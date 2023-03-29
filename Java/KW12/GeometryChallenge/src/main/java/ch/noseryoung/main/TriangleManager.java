package ch.noseryoung.main;

import java.util.ArrayList;

public class TriangleManager {
    private ShapeSideCreator generator;
    private TriangleValidator triangleValidator;
    private ArrayList<Triangle> triangles;

    public TriangleManager(ShapeSideCreator generator) {
        this.generator = generator;
        triangleValidator = new TriangleValidator();
        triangles = new ArrayList<>();
    }

    public void run() {
        printWelcomeText();
        ArrayList<Triangle> triangles = new ArrayList<Triangle>();
        for (int i = 0; i < 3; i++) {
            Triangle triangle = generateTriangle();
            boolean isEquilateral = triangleValidator.isEquilateral(triangle);
            boolean isIsosceles = triangleValidator.isIsosceles(triangle);
            boolean isScalene = triangleValidator.isScalene(triangle);
            if (isEquilateral || isIsosceles || isScalene) {
                triangles.add(triangle);
                printTriangleInfo(triangle, isEquilateral, isIsosceles, isScalene);
            }
        }
    }

    private Triangle generateTriangle() {
        ShapeSideCreator sideCreator = new SideCreatorService();
        double side1 = sideCreator.createSide();
        double side2 = sideCreator.createSide();
        double side3 = sideCreator.createSide();
        return new Triangle(side1, side2, side3);
    }

    private void printTriangleInfo(Triangle t, boolean isEquilateral, boolean isIsosceles, boolean isScalene) {
        String triangleType = (triangleValidator.isEquilateral(t) ? "Equilateral" : (triangleValidator.isIsosceles(t) ? "Isoceles" : (triangleValidator.isScalene(t) ? "Scalene" : "Invalid")));
        System.out.println("*************************************");
        System.out.println("* Triangle Information *");
        System.out.println("*************************************");
        System.out.println("Side 1: " + t.getA() + "\nSide 2: " + t.getB() + "\nSide 3: " + t.getC() + "\nType of triangle: " + triangleType);
    }

    private TriangleType getTriangleType(boolean isEquilateral, boolean isIsosceles, boolean isScalene) {
        if (isEquilateral) {
            return TriangleType.equilateral;
        } else if (isIsosceles) {
            return TriangleType.isosceles;
        } else if (isScalene) {
            return TriangleType.scalene;
        } else {
            return TriangleType.unknown;
        }
    }

    private enum TriangleType {equilateral, isosceles, scalene, unknown}

    public ArrayList<Triangle> getAllTrianglesSortedByLongestSide() {
        ArrayList<Triangle> sortedTriangles = new ArrayList<>();
        for (Triangle triangle : triangles) {
            double longestSide = triangle.getLongestSide();
            int i = sortedTriangles.size() - 1;
            while (i >= 0 && sortedTriangles.get(i).getLongestSide() < longestSide) {
                i--;
            }
            sortedTriangles.add(i + 1, triangle);
        }
        return sortedTriangles;
    }

    private void printWelcomeText() {
    System.out.println("Welcome to my Triangle Manager!");
    }
}