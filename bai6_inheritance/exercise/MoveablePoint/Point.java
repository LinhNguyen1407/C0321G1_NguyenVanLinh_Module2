package bai6_inheritance.exercise.MoveablePoint;

import java.util.Arrays;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    Point () {
    }

    Point (float x, float y) {
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
        return "Point có tọa độ x, y lần lượt là " + Arrays.toString(getXY());
    }
}
