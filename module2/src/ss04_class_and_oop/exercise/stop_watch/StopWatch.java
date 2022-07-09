package ss04_class_and_oop.exercise.stop_watch;

public class StopWatch {
    private long starTime;
    private long endTime;



    public long StopWatch() {
        return this.starTime = System.currentTimeMillis();
    }

    public long getStarTime() {
        return this.starTime;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public long start() {
        return this.starTime = System.currentTimeMillis();
    }

    public long stop() {
        return this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return getEndTime() - getStarTime();
    }

}
