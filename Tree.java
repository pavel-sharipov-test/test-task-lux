package com.sharipov;

/**
 * Created by pavel on 28.02.2017.
 */
public class Tree {
    private int x;
    private int y;
    private int r;

    @Override
    public String toString() {
        return "Tree{" +
                "x=" + x +
                ", y=" + y +
                ", r=" + r +
                '}';
    }

    public Tree(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public int getY() {

        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getX() {

        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
