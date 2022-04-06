
import java.util.Random;
import java.util.Scanner;
import java.util.function.Function;


public class Arrays {

    public static void main(String[] args) {

               Scanner in = new Scanner(System.in);          // заполняем пустой массив с консоли
        System.out.print("Enter a number of array:");
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a [" +i+"] = ");
            a[i] = in.nextInt();
        }

        //create an array with length of 10
        int[] arr = new int[10];
//fill array with random numbers between 50 and 100
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(50) + 50;
        }
//print array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
//find max value of array
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }
//find min value of array
//print max && min value of array
        System.out.println("Max value is " + maxValue);



    }
}

