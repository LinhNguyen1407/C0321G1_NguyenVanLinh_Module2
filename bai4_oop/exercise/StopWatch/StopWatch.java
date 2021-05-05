package bai4_oop.exercise.StopWatch;
import java.time.*;

public class StopWatch {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        System.out.println("Đang đếm thời gian");
        for (int i = 1; i <= 100000; i++) {
            stopWatch.stop();
            stopWatch.getElapsedTime();
        }
    }

    public LocalTime startTime;
    public LocalTime endTime;

    LocalTime getStartTime() {
        return this.startTime;
    }

    LocalTime getEndTime() {
        return this.endTime;
    }

    StopWatch() {
        startTime = LocalTime.now();
    }

    void start() {
        startTime = LocalTime.now();
    }

    void stop() {
        endTime = LocalTime.now();
    }

    void getElapsedTime() {
        int elaspedTime = (startTime.toSecondOfDay() - endTime.toSecondOfDay()) * 100;
        System.out.println("Số mili giây đếm đc:" + elaspedTime);
    }
}
