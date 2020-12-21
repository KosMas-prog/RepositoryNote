package lesson_1;

public class Main {
    public static void main(String[] args) {
        Men men = new Men(25000,150);
        men.toJump();;
        men.toRun();
        Cat cat = new Cat(5000,200);
        cat.toJump();
        cat.toRun();
        Robot robot = new Robot(100000,500);
        robot.toJump();
        robot.toRun();
    }
}
