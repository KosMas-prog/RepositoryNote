package lesson_1;

public class Distance implements OvercomingAnObstacle{
    private int distance;

    public int getDistance() {
        return distance;
    }

    @Override
    public void overcoming(Runnable runnner) {
        runnner.toRun(distance);
    }

    public Distance(int distance){
        this.distance = distance;
    }
}
