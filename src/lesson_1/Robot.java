package lesson_1;

public class Robot implements Runnable{
    private   int maxDistance;
    private   int maxHeight;
    boolean notCan;

    @Override
    public void toRun(int distance) {
        if(distance<= maxDistance) {
            System.out.println("Робот пробежал дистанцию "+distance);
        }else {
            System.out.println("Робот не смог пробежать "+distance);
            notCan = true;
        }
    }

    @Override
    public void toJump(int height) {
        if (height<=maxHeight){
            System.out.println("Робот перепрыгнул стену высотой "+ height);
        }else {
            System.out.println("Робот не смог перепрыгнуть стену высотой "+height);
            notCan = true;
        }
    }

    @Override
    public boolean onDistance() {
        if(notCan==true) {
            System.out.println("Робот сошел с дистанции!");
        }
        return false;
    }

    public Robot(){
    }
    public Robot(int maxDistance, int maxHeight){
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
    }
}
