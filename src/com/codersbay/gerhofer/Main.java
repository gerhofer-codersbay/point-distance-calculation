package com.codersbay.gerhofer;

import com.codersbay.gerhofer.geometry.Point;

public class Main {

    public static void main(String[] args) {

        Point a = new Point(3, 2);
        Point b = new Point(5, 5);

        Double distance = calculateDistance(a, b);
        System.out.printf("The distance between %s and %s is %.2f\n", a, b, distance);

        Point c = new Point(-3, 3);
        Point d = new Point(-5, -5);

        Double distance2 = calculateDistance(c, d);
        System.out.printf("The distance between %s and %s is %.2f\n", c, d, distance2);

    }

    public static Double calculateDistance(Point a, Point b) {
        return Math.sqrt(
                Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2)
        );
    }

}
