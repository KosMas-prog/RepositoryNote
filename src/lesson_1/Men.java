package lesson_1;

public class Men implements Runnable{
    private int maxDistance;
    private int maxHeight;
    boolean notCan;



    @Override
    public void toRun(int distance) {
        if(distance<= maxDistance) {
            System.out.println("Человек пробежал дистанцию "+distance);
        }else {
            System.out.println("Человек не смог пробежать "+distance);
            notCan = true;
        }

    }

    @Override
    public void toJump(int height) {
        if (height<=maxHeight){
            System.out.println("Человек перепрыгнул стену "+height);
        }else {
            System.out.println("Человек не смог перепрыгнуть стену "+height);
            notCan = true;
        }

    }
    @Override
    public boolean onDistance() {
        if(notCan==true) {
            System.out.println("Человек сошел с дистанции!");
        }
        return false;
    }
    public Men(){
    }
    public Men(int maxDistance, int maxHeight){
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
    }
}
