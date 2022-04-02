package algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//Подсчет суммы троек
public class ThreeSum {
    static int count;
    public static void printResult(int[] a) {
        for (int i = 0; i < a.length; i++) System.out.print(a[i] + " ");
    }

    public static void countTriples(int[] a, int sum) {
    int n = a.length;
    count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (a[i] + a[j] + a[k] == sum) count++;
                }
            }
        }
    }

    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                System.out.print("Введите размер массива: ");
                int n = Integer.parseInt(reader.readLine());
                System.out.println();
                System.out.println("Введите, чему будет равнться сумма троек, которые будут подсчитываться: ");
                int sum = Integer.parseInt(reader.readLine());
                System.out.println();
                int a[] = new int[n];
                System.out.println("Введите " + n + " целочисленных значений в массив: ");
                for (int i = 0; i < n; i++) {
                    a[i] = Integer.parseInt(reader.readLine());
                }

                printResult(a);
                countTriples(a, sum);
                System.out.println();
                System.out.println(count);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
