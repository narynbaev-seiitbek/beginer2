package Peaksoft.Lessons.loops;

import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        System.out.print("Enter number of array: ");
        int a = n.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" Enter elements: ");
            arr[i] = n.nextInt();
        }
        for (int elem:arr) {
            System.out.print(elem+ " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0) {
                System.out.print(arr[i]+" ");
            }
            }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==5) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
