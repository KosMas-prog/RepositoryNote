package lesson_2;

public class Main {
    public static void main(String[] args) {
        String[][] arr = {{"1", "2", "3", "4"},{"1","2","3","4"},{"1","2","3","4"}, {"1","2","3","4"}};
        String[][] arr2 = {{"1", "text", "3", "4"},{"1","2","3","4"},{"1","2","3","4"}, {"1","2","3","4"}};
        String[][] arr3 = {{"1", "2", "3"},{"1","2","3","4"},{"1","2","3","4"}};
        arrayInMethodSum(arr);
        arrayInMethodSum(arr2);
        arrayInMethodSum(arr3);

    }
    public static void arrayInMethodSum(String[][] arrs) throws MyArrayDataException, MyArraySizeException{
        int sum = 0;
            if (arrs.length == 4 && arrs[0].length == 4 && arrs[1].length == 4 && arrs[2].length == 4 && arrs[3].length == 4) {
                for (int i = 0; i < arrs.length; i++) {
                    for (int y = 0; y < arrs[i].length; y++) {
                        try {
                            sum = Integer.parseInt(arrs[i][y]) + sum;
                        } catch (NumberFormatException e) {
                            System.out.println(arrs[i][y] + " строка: " + i + "   столбец: " + y);
                            throw new MyArrayDataException(arrs);
                        }
                    }
                }
            }else {
                throw new MyArraySizeException(arrs);
            }
            System.out.println(sum);
    }

}
