package ch.noseryoung.main;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TriangleValidatorTest {


    @Test
    public void IsEquilateral_WithNegativeSides_ReturnsTrue() {

        TriangleValidator test1 = new TriangleValidator();

        Triangle t = new Triangle(-3, -3, -3);

        boolean expectedResult = true;

        boolean result = test1.isAllNegative(t);

        assertEquals(result, expectedResult);
    }
    @Test
    public void NegativeSide_ReturnsTrue() {

        TriangleValidator test1 = new TriangleValidator();

        Triangle t = new Triangle(3, -3, 43);

        boolean expectedResult = true;

        boolean result = test1.isNegative(t);

        assertEquals(result, expectedResult);
    }

    @Test
    public void AllSidesAreZero_ReturnsTrue(){

        TriangleValidator test2 = new TriangleValidator();

        Triangle t = new Triangle(0,0,0);

        boolean expectedResult = true;

        boolean result = test2.isAllNull(t);

        assertEquals(result, expectedResult);
    }
    @Test
    public void OneSideIsZero_ReturnsTrue(){

        TriangleValidator test2 = new TriangleValidator();

        Triangle t = new Triangle(4,0,3);

        boolean expectedResult = true;

        boolean result = test2.isNull(t);

        assertEquals(result, expectedResult);
    }
    @Test
    public void ValidScalene_ReturnsFalse(){

        TriangleValidator test3 = new TriangleValidator();

        Triangle t = new Triangle(1,2,5);

        boolean expectedResult = false;

        boolean result = test3.isValid(t);

        assertEquals(result, expectedResult);
    }
    @Test
    public void ValidIsosceles_Permutation1(){

        TriangleValidator test4 = new TriangleValidator();

        Triangle t = new Triangle(3,3,4);

        boolean expectedResult = true;

        boolean result = test4.isIsosceles(t);

        assertEquals(result, expectedResult);
    }
    @Test
    public void ValidIsosceles_Permutation2(){

        TriangleValidator test5 = new TriangleValidator();

        Triangle t = new Triangle(3,4,3);

        boolean expectedResult = true;

        boolean result = test5.isIsosceles(t);

        assertEquals(result, expectedResult);
    }
    @Test
    public void ValidIsosceles_Permutation3(){

        TriangleValidator test6 = new TriangleValidator();

        Triangle t = new Triangle(4,3,3);

        boolean expectedResult = true;

        boolean result = test6.isIsosceles(t);

        assertEquals(result, expectedResult);
    }
    @Test
    public void OneSideIsNegative_ReturnsFalse(){

        TriangleValidator test7 = new TriangleValidator();

        Triangle t = new Triangle(4,3,-3);

        boolean expectedResult = true;

        boolean result = test7.isNegative(t);

        assertEquals(result, expectedResult);
    }
    @Test
    public void TriangleIsPermutation_ReturnsFalse1(){

        TriangleValidator test8 = new TriangleValidator();

        Triangle t = new Triangle(1,3,2);

        boolean expectedResult = false;

        boolean result = test8.isValid(t);

        assertEquals(result, expectedResult);
    }
    @Test
    public void TriangleIsPermutation_ReturnsFalse2(){

        TriangleValidator test9 = new TriangleValidator();

        Triangle t = new Triangle(5,5,10);

        boolean expectedResult = false;

        boolean result = test9.isValid(t);

        assertEquals(result, expectedResult);
    }
    @Test
    public void TriangleIsPermutation_ReturnsFalse3(){

        TriangleValidator test9 = new TriangleValidator();

        Triangle t = new Triangle(100,50,50);

        boolean expectedResult = false;

        boolean result = test9.isValid(t);

        assertEquals(result, expectedResult);
    }

}