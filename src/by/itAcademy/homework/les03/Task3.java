package by.itAcademy.homework.les03;

// 3. Определить сумму элементов целочисленного массива, расположенных между ближайшими минимальным и максимальным значениями, не включая минимальное и максимальное значение.
// 0 2 3 9 -> 5
// 0 2 3 9 1 1 1 0 1 2 9 -> 2+3+1+2=8
// 0 2 9 8 0 4 9 -> 2+4= 6

public class Task3 {
    public static void main(String[] args) {
        int[] array = {0, 2, 3, 9, 1, 1, 1, 0, 1, 2, 9, 0};

        int max = array[0];
        int min = array[0];
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        // доходим до предпоследнего элемента, так как идти дальше нет смысла
        for (int i = 0; i < array.length-2; i++) {
            if (array[i] == min) {
                for (int k = i + 1; array[k] != max; k++) {
                    sum += array[k];
                }
            }
        }
        System.out.println(sum);
    }
}
