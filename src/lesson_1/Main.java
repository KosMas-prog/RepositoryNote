package lesson_1;

public class Main {
    public static void main(String[] args) {
        Runnable[] runnables = {new Men(42000,140),new Cat(3000,210), new Robot(100000,300)};
        OvercomingAnObstacle[] overcomingAnObstacles = {new Distance(1000), new Wall(100), new Distance(5000), new Wall(200), new Distance(45000), new Wall(1000)};
        for (Runnable runnable : runnables) {
            for (OvercomingAnObstacle overcomingAnObstacle : overcomingAnObstacles) {
                overcomingAnObstacle.overcoming(runnable);
                runnable.onDistance();
                /*if (!runnable.onDistance()) {
                    break;
                }*/


        }
      }
    }
}
