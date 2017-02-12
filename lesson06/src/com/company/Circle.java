package com.company;

/**
 * Created by hackeru on 2/12/2017.
 */
public class Circle {

    private Point center;
    private int radius;
    private int z;

    public class Point{
        private int x,y;
        private int z;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
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

        public int getZ(){
            return Circle.this.z;
        }

        @Override
        public String toString() {
            return "("+x+","+y+")";
        }
    }




    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
