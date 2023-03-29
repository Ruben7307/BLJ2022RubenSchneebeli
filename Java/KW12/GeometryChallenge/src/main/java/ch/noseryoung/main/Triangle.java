package ch.noseryoung.main;

public class Triangle {
  private double a;
  private double b;
  private double c;
  private double longestSide;

  public Triangle(double a, double b, double c){
    this.a = a;
    this.b = b;
    this.c = c;
  }


  public double getA() {
    return a;
  }

  public double getB() {
    return b;
  }

  public double getC() {
    return c;
  }

  public double getLongestSide() {
    return longestSide;
  }

  public void setLongestSide(double longestSide){
    this.longestSide = longestSide;
  }
}
