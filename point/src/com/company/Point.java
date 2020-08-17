package com.company;

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
       return Math.sqrt((0 - getX()) * (0 - getX()) + (0 - getY()) * (0 - getY()));
    }

    public double distance(int x, int y){
        return Math.sqrt((x - getX()) * (x - getX()) + (y - getY()) * (y - getY()));
    }

    public double distance(Point otherPoint){
        return Math.sqrt((otherPoint.getX() - getX()) * (otherPoint.getX() - getX()) + (otherPoint.getY() - getY()) * (otherPoint.getY() - getY()));
    }
}
