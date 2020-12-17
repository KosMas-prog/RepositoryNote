package lesson_1;

public interface Jumpable {
    default void Jump(){
        System.out.println("Я прыгаю!");
    }
}
