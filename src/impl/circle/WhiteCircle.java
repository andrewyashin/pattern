package impl.circle;

import shape.Circle;

public class WhiteCircle implements Circle {
    double radius;

    public WhiteCircle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public double getSquare() {
        return Math.PI * radius * radius;
    }

    @Override
    public String draw() {
        int radiusIntValue = (int) this.radius;
        int coordinateX = 5;
        int coordinateY = 15;
        for (int i = 0;i <= coordinateX + radiusIntValue; i++) {
            for (int j = 1;j <=coordinateY + radiusIntValue; j++) {
                int xSquared = (i - coordinateX)*(i - coordinateX);
                int ySquared = (j - coordinateY)*(j - coordinateY);
                if (Math.abs(xSquared + ySquared - radiusIntValue * radiusIntValue) < radiusIntValue) {
                    System.out.print((char)27 + "[37m*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        return "White Circle";
    }
}
