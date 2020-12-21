package lesson_1;

import org.w3c.dom.ls.LSOutput;

public interface Runnable {
    default void toRun() {
        System.out.println("Я пробежал!");
    }
    default void toRun(int maxDistance,int maxHeight){
       // if ()
    }
}
