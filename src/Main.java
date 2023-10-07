import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] array = {8, 2, -4, 2, 3, 6, -7, 5, -9, 1, 4, -3, 0, 7, 10};
        double sum = 0;
        boolean foundFirstNegative = false;

        for (double number : array) {
            if (foundFirstNegative) {
                if (number > 0) {
                    sum += number;
                }
            } else if (number < 0) {
                foundFirstNegative = true;
            }
        }

        int positiveCount = 0;
        for (double number : array) {
            if (number > 0) {
                positiveCount++;
            }
        }

        double average = sum / positiveCount;
        System.out.println("Среднее арифметическое положительных чисел после первого отрицательного: " + average);

        sortArray(array);
        System.out.println("Отсортированный массив:");
        for (double number : array) {
            System.out.print(number + " ");
        }
    }

    public static void sortArray(double[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            double temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            printArray(arr);
        }
    }

    public static void printArray(double[] arr) {
        for (double number : arr) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
