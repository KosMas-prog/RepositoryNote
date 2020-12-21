package lesson_1;

public interface Jumpable {
    default void toJump(){
        System.out.println("Я прыгнул!");
    }
}
