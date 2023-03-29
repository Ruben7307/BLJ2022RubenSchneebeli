package ch.noseryoung.main;


import java.util.Random;

public class SideCreatorService implements ShapeSideCreator{

  /**
   * This method generates a random <code>double</code>, rounded to .0 or .5.
   *
   * @return the generated value, to be used as a side for a shape
   */
  @Override
  public double createSide() {
      Random rand = new Random();
      double num = rand.nextDouble()*3;
      num = Math.round(num * 2) / 2.0;
      return num;
  }
}

