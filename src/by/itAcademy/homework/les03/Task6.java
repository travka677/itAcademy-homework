package by.itAcademy.homework.les03;

// 6. Написать метод equals, который определяет, равны ли между собой соответствующие элементы
// 2-х двумерных массивов.

public class Task6 {
    public static void main(String[] args) {
        int[][] array1 = { {1, 2, 3}, {4, 5, 6, 76}, {9, 8, 9} };
        int[][] array2 = { {4}, {41, 5, 6}, {9, 12, 3, 33} };

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                try {
                    if (array1[i][j] == array2[i][j]) {
                        System.out.println(array1[i][j] + " = " + array2[i][j]);
                    }
                } catch (ArrayIndexOutOfBoundsException ex) {
                }
            }
        }
    }
}
