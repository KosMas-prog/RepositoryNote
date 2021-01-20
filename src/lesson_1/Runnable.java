package lesson_1;

public interface Runnable {
    default void toRun(int distance) {

    }
    default void toJump(int height){

    }
    default boolean onDistance(){
        return false;
    }
}
