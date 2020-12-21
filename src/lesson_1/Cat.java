package lesson_1;

public class Cat implements Runnable, Jumpable {
    private  int maxDistance;
    private  int maxHeight;

    public Cat(){
    }
    public Cat(int maxDistance, int maxHeight){
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
    }
}
