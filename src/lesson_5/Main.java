package lesson_5;

import lesson_1.Runnable;

public class Main {
    static final int size = 10000000;
    static final int  h = size/2;

    public static void main(String[] args) {
        float[] arr = new float[size];
        for(int i = 0; i <size; i++){
            arr[i] = 1;
        }
        float[] arr2 = new float[size];
        for(int i = 0; i <size; i++){
            arr2[i] = 1;
        }

        arrayWrite(arr);
        arrayWriteThread(arr2);

    }
    static void arrayWrite (float[] arr){
        long a = System.currentTimeMillis();
        for(int i = 0; i < arr.length; i++){
            arr[i] = (float) (arr[i]*Math.sin(0.2f + i/5) * Math.cos(0.4f + i / 2));
        }
        long b = System.currentTimeMillis();
        System.out.println("Время пересчета массива: " + (b-a) + " млс");
    }
    static void  arrayWriteThread(float[] arr){

        float[] a1 = new float[h];
        float[] a2 = new float[h];

        long a = System.currentTimeMillis();

        System.arraycopy(arr, 0,a1, 0, h);
        System.arraycopy(arr, h,a2, 0, h);

        long b = System.currentTimeMillis();
        System.out.println("Время разбивки массива на две части: " + (b-a) + " млс");


        class MyThreadOne extends Thread{
            @Override
            public void run() {
                super.run();
                for(int i = 0; i < a1.length; i++) {
                    a1[i] = (float) (a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
                long c = System.currentTimeMillis();
                System.out.println("Время расчета нового значения \n для элементов массива в Потоке 1: " + (c-b) + " mls");
            }
        }
        new MyThreadOne().run();

        class MyThreadTwo extends Thread{
            @Override
            public void run() {
                super.run();
                long d = System.currentTimeMillis();
                for (int i = 0; i < a2.length; i++) {
                    a2[i] = (float) (a2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
                long e = System.currentTimeMillis();
                System.out.println("Время расчета нового значения \n для элементов массива в Потоке 2: " + (e-d) + " mls");
            }
        }
        new MyThreadTwo().run();

        long f = System.currentTimeMillis();
        System.arraycopy(a1,0,arr, 0,h);
        System.arraycopy(a2,0,arr, h,h);
        long g = System.currentTimeMillis();
        System.out.println("Время склейки массива: " + (f-g) + " mls");
    }
}
