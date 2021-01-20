package lesson_1;

public class Wall implements OvercomingAnObstacle{
    private int height;

    public int getHeight() {
        return height;
    }

    @Override
    public void overcoming(Runnable runnner) {
        runnner.toJump(height);
    }

    public Wall(int height){
        this.height = height;
    }
}
