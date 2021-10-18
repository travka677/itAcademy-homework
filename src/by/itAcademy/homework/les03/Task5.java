package by.itAcademy.homework.les03;

// 5. Создать двухмерный квадратный массив, и заполнить его "бабочкой", т.е. таким образом:

// 1 1 1 1 1
// 0 1 1 1 0
// 0 0 1 0 0
// 0 1 1 1 0
// 1 1 1 1 1

//Вывести его на экран, заменив 1 символом *, а 0 - пробелом.

public class Task5 {
    public static void main(String[] args) {

        // решение из интернета
        int arr[][] = new int[6][6];

        for (int i = 0; i < arr.length / 2 + 1; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((j < i) || (j >= (arr[i].length - i))) {
                    arr[i][j] = 0;
                } else {
                    arr[i][j] = 1;
                }
            }

        }

        for (int i = arr.length - 1; i >= arr.length / 2; i--) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((j < (arr[i].length - 1 - i)) || (j > i)) {
                    arr[i][j] = 0;
                } else {
                    arr[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
