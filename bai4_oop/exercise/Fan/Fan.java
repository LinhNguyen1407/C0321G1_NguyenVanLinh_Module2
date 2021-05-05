package bai4_oop.exercise.Fan;

public class Fan {
    static final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;
    private int speed = SLOW;
    boolean on = false;
    private double radius = 5;
    private String color = "blue";

    Fan() {
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    int getSpeed() {
        return this.speed;
    }

    void setOn(boolean on) {
        this.on = on;
    }

    boolean getOn() {
        return this.on;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return this.radius;
    }

    void setColor(String color) {
        this.color = color;
    }

    String getColor() {
        return this.color;
    }

    public String toString() {
        if (this.on) {
            return "Fan is on: " + "speed " + this.speed + " color " + this.color + " radius " + this.radius;
        } else {
            return "Fan is off: " + "speed " + this.speed + " color " + this.color + " radius " + this.radius;
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setOn(true);
        fan1.setSpeed(FAST);
        fan1.setColor("yellow");
        fan1.setRadius(10);
        fan2.setOn(false);
        fan2.setSpeed(MEDIUM);
        fan2.setColor("green");
        fan2.setRadius(5);
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
