package test;

import ecolor.Color;
import factories.AbstractFactory;
import factories.BaseFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import shape.Circle;
import shape.Rectangle;
import shape.Triangle;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.runners.Parameterized.*;

/**
 * Just a few obvious tests.
 *
 * @author Oleg Chernienko
 * @version 1.0 17 May 2017
 */
@RunWith(Parameterized.class)
public class TestShapeOperations {

    private static double DELTA = .000005;

    BaseFactory factory = null;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {Color.RED}, {Color.WHITE}, {Color.BLACK}});
    }

    @Parameter
    public Color factoryColor;

    @Test
    public void testCircleSquareZeroRadius() {
        factory = AbstractFactory.getFactory(factoryColor);
        Circle circle = factory.createCircle(.0);
        double actual = circle.getSquare();
        double expected = .0;
        Assert.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void testCircleSquare() {
        factory = AbstractFactory.getFactory(factoryColor);
        double radius = 5;
        Circle circle = factory.createCircle(radius);
        double actual = circle.getSquare();
        double expected = findCircleSquare(radius);
        Assert.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void testTriangleSquareZeroSides() {
        factory = AbstractFactory.getFactory(factoryColor);
        double sideA = 0, sideB = 0, sideC = 0;
        Triangle triangle = factory.createTriangle(sideA, sideB, sideC);
        double actual = triangle.getSquare();
        double expected = findTriangleSquare(sideA, sideB, sideC);
        Assert.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void testTriangleSquare() {
        factory = AbstractFactory.getFactory(factoryColor);
        double sideA = 3;
        double sideB = 4;
        double sideC = 5;
        Triangle triangle = factory.createTriangle(sideA, sideB, sideC);
        double actual = triangle.getSquare();
        double expected = findTriangleSquare(sideA, sideB, sideC);
        Assert.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void testRectangleSquareZeroSides() {
        factory = AbstractFactory.getFactory(factoryColor);
        double sideA = .0, sideB = .0;
        Rectangle rectangle = factory.createRectangle(sideA, sideB);
        double actual = rectangle.getSquare();
        double expected = findRectangleSquare(sideA, sideB);
        Assert.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void testRectangleSquare() {
        factory = AbstractFactory.getFactory(factoryColor);
        double sideA = 3.;
        double sideB = 4.;
        Rectangle rectangle = factory.createRectangle(sideA, sideB);
        double actual = rectangle.getSquare();
        double expected = findRectangleSquare(sideA, sideB);
        Assert.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void testCircleLengthZeroSides() {
        factory = AbstractFactory.getFactory(factoryColor);
        Circle circle = factory.createCircle(.0);
        double actual = circle.getPerimeter();
        double expected = findCircleLength(.0);
        Assert.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void testCircleLength() {
        factory = AbstractFactory.getFactory(factoryColor);
        double radius = 2.3;
        Circle circle = factory.createCircle(radius);
        double actual = circle.getPerimeter();
        double expected = findCircleLength(radius);
        Assert.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void testTrianglePerimeterZeroSides() {
        factory = AbstractFactory.getFactory(factoryColor);
        double sideA = 0, sideB = 0, sideC = 0;
        Triangle triangle = factory.createTriangle(sideA, sideB, sideC);
        double actual = triangle.getPerimeter();
        double expected = findTrianglePerimeter(sideA, sideB, sideC);
        Assert.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void testTrianglePerimater() {
        factory = AbstractFactory.getFactory(factoryColor);
        double sideA = 3;
        double sideB = 4;
        double sideC = 5;
        Triangle triangle = factory.createTriangle(sideA, sideB, sideC);
        double actual = triangle.getPerimeter();
        double expected = findTrianglePerimeter(sideA, sideB, sideC);
        Assert.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void testRectanglePerimeterZeroSides() {
        factory = AbstractFactory.getFactory(factoryColor);
        double sideA = .0, sideB = .0;
        Rectangle rectangle = factory.createRectangle(sideA, sideB);
        double actual = rectangle.getPerimeter();
        double expected = findRectanglePerimeter(sideA, sideB);
        Assert.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void testRectanglePerimeter() {
        factory = AbstractFactory.getFactory(factoryColor);
        double sideA = 3.;
        double sideB = 4.;
        Rectangle rectangle = factory.createRectangle(sideA, sideB);
        double actual = rectangle.getPerimeter();
        double expected = findRectanglePerimeter(sideA, sideB);
        Assert.assertEquals(expected, actual, DELTA);
    }

    private double findCircleSquare(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    private double findTriangleSquare(double sideA, double sideB, double sideC) {
        double halfPerimeter = .5 * findTrianglePerimeter(sideA, sideB, sideC);
        return Math.sqrt(halfPerimeter * (halfPerimeter - sideA)
                * (halfPerimeter - sideB) * (halfPerimeter - sideC));
    }

    private double findRectangleSquare(double sideA, double sideB) {
        return sideA * sideB;
    }

    private double findCircleLength(double radius) {
        return 2 * Math.PI * radius;
    }

    private double findTrianglePerimeter(double sideA, double sideB, double sideC) {
        return sideA + sideB + sideC;
    }

    private double findRectanglePerimeter(double sideA, double sideB) {
        return 2 * (sideA + sideB);
    }
}
