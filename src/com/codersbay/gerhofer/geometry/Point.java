package com.codersbay.gerhofer.geometry;

public class Point {

    private Double radius;
    private Double angle;

    public Point(Integer x, Integer y) {
        this.radius = Math.sqrt(
                Math.pow(x, 2) + Math.pow(y, 2)
        );
        this.angle = Math.atan(-x / this.radius);
    }

    public Integer getX() {
        return ((Double) (this.radius * Math.cos(this.angle))).intValue() ;
    }

    public void setX(Integer x) {
        if (x < 0) {
            throw new IllegalArgumentException("X must not be less than zero!");
        }
        //this.x = x;
    }

    public Integer getY() {
        return ((Double) (this.radius * Math.sin(this.angle))).intValue() ;
    }

    public void setY(Integer y) {
        if (y < 0) {
            throw new IllegalArgumentException("Y must not be less than zero!");
        }
        //this.y = y;
    }

    @Override
    public String toString() {
        return String.format("Point [x=%d, y=%d]",
                this.getX(),
                this.getY());
    }

}
