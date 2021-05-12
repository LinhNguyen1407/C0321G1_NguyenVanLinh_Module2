package bai6_inheritance.exercise.MoveablePoint;

import java.util.Arrays;

public class MoveablePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    MoveablePoint (){
    }

    MoveablePoint (float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    MoveablePoint (float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    void setXSpeed (float xSpeed) {
        this.xSpeed = xSpeed;
    }

    float getXSpeed () {
        return this.xSpeed;
    }

    void setYSpeed (float ySpeed) {
        this.ySpeed = ySpeed;
    }

    float getYSpeed () {
        return this.ySpeed;
    }

    void setSpeed (float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    float[] getSpeed () {
        return new float[] {this.xSpeed, this.ySpeed};
    }

    @Override
    public String toString() {
        return "Moveable có tốc độ điểm x, y là " + Arrays.toString(getSpeed()) + " là lớp con của lớp " + super.toString();
    }

    MoveablePoint move() {
        float temp1 = super.getX() + getXSpeed();
        float temp2 = super.getY() + getYSpeed();
        super.setXY(temp1, temp2);
        return this;
    }
}
