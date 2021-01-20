package lesson_1;

public class Cat implements Runnable{
    private   int maxDistance;
    private   int maxHeight;
    boolean notCan;

    @Override
    public void toRun(int distance) {
        if(distance<= maxDistance) {
            System.out.println("Кот пробежал дистанцию "+distance);
        }else {
            System.out.println("Кот не смог пробежать "+distance);
            notCan = true;
        }

    }

    @Override
    public void toJump(int height) {
        if (height<=maxHeight){
            System.out.println("Кот перепрыгнул стену "+ height);
        }else {
            System.out.println("Кот не смог перепрыгнуть стену "+height);
            notCan = true;
        }

    }
    @Override
    public boolean onDistance() {
        if(notCan==true) {
            System.out.println("Кот сошел с дистанции!");
        }
        return false;
    }
    public Cat(){
    }
    public Cat(int maxDistance, int maxHeight){
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
    }
}
