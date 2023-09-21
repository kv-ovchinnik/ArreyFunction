import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        FillRand(arr);
        Print(arr);
        Sort(arr);
        Print(arr);
        double[] brr = new double[n];
        FillRand(brr);
        Print(brr);

    }

    static void FillRand(int[] arr, int minRand, int maxRand) {
        Random rand = new Random(0);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(minRand, maxRand);
        }
    }
    static void FillRand(double[] arr, int minRand, int maxRand) {
        Random rand = new Random(0);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(minRand, maxRand);
        }
    }

    static void Print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
    static void Print(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    static void Sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int buffer = arr[i];
                    arr[i] = arr[j];
                    arr[j] = buffer;
                }
            }
        }
    }

}
