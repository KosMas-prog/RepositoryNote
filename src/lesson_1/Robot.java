package lesson_1;

public class Robot implements Runnable, Jumpable {
    private  int maxDistance;
    private  int maxHeight;

    public Robot(){
    }
    public Robot(int maxDistance, int maxHeight){
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
    }
}
