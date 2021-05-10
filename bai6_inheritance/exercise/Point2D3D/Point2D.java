package bai6_inheritance.exercise.Point2D3D;

import java.util.Arrays;

public class Point2D {
    private float x = 10;
    private float y = 10;

    Point2D() {
    }

    Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    void setX(float x) {
        this.x = x;
    }

    float getX() {
        return this.x;
    }

    void setY(float y) {
        this.y = y;
    }

    float getY() {
        return this.y;
    }

    void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    float[] getXY() {
        return new float[]{this.x, this.y};
    }

    public String toString() {
        return "Point2D có tọa độ x, y lần lượt là " + Arrays.toString(getXY());
    }
}
