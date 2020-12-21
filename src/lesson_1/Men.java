package lesson_1;

public class Men implements Runnable, Jumpable {
    private  int maxDistance;
    private  int maxHeight;

    public Men(){
    }
    public Men(int maxDistance, int maxHeight){
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
    }
}
