package lesson_2;

public class MyArraySizeException extends IllegalArgumentException{
    public MyArraySizeException(String[][] arrs) {
        System.out.println("Введен массив не корректной размерности");
    }
}

