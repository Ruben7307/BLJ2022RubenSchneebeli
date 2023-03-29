package ch.noseryoung.main;

import org.w3c.dom.ls.LSOutput;

public class TriangleValidator {

    /**
     * Checks if the Triangle is equilateral or not.
     * Returns only true if all sides equal the same lengths.
     *
     * @param t triangle to be evaluated
     * @return true the triangle is equilateral , false if not
     */
    public boolean isEquilateral(Triangle t) {
        double a = t.getA();
        double b = t.getB();
        double c = t.getC();
        return a == b && b == c;
    }

    /**
     * Checks if the Triangle is isosceles or not.
     * Returns only true if two sides equal the same lengths.
     *
     * @param t triangle to be evaluated
     * @return true the triangle is isosceles , false if not
     */
    public boolean isIsosceles(Triangle t) {
        double a = t.getA();
        double b = t.getB();
        double c = t.getC();
        return a == b || b == c || c == a;
    }

    /**
     * Checks if the Triangle is scalene or not.
     * Returns only true if no sides equal the same lengths.
     *
     * @param t triangle to be evaluated
     * @return true the triangle is scalene, false if not
     */
    public boolean isScalene(Triangle t) {
        double a = t.getA();
        double b = t.getB();
        double c = t.getC();
        return a != b && b != c && c != a;
    }

    /**
     * Checks if the Triangle is a valid triangle.
     * A triangle is valid if the sum of the lengths of any two sides is greater than the length of the third side.
     *
     * @param t triangle to be evaluated
     * @return true if the triangle is valid, false if not
     */
    public boolean isValid(Triangle t) {
        double a = t.getA();
        double b = t.getB();
        double c = t.getC();
        return (a + b > c) && (b + c > a) && (c + a > b);
    }


    public Boolean isNull(Triangle t){
        double a = t.getA();
        double b = t.getB();
        double c = t.getC();
        return (a == 0 || b == 0 || c == 0);
    }

    public Boolean isAllNull(Triangle t){
        double a = t.getA();
        double b = t.getB();
        double c = t.getC();
        return (a == 0 && b == 0 && c == 0);
    }
    public Boolean isNegative(Triangle t){
        double a = t.getA();
        double b = t.getB();
        double c = t.getC();
        return (a < 0 || b < 0 || c < 0);
    }
    public Boolean isAllNegative(Triangle t){
        double a = t.getA();
        double b = t.getB();
        double c = t.getC();
        return (a < 0 && b < 0 && c < 0);
    }

}