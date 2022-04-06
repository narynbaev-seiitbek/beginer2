package Peaksoft.Lessons;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        boolean i = true;
        int res = 0;
        int result = 0;
        while (a > 0) {
            int b = a % 10;
            int c = a / 10 % 10;
            if (b == c) {
                result = ++res;
                i = false;
            }
            a /= 10;
        }
        System.out.println(result);
        if (i == true) {
            System.out.println("jok");
        } else {
            System.out.println("Bar");
        }
    }
}
//        System.out.print("Числа которые делятся на 3,4,5: ");  //homework 9-1
//        System.out.println("Общая сумма: " + printDevidedNumbers(300));
//    }
//       static int printDevidedNumbers(int array) {
//            int sum=0;
//            for (int i = 1; i < 300; i++) {
//                if(i%3==0 && i%4==0 && i%5==0){
//                    sum+=i;
//                    System.out.print(i+ " ");
//                }
//            }
//            System.out.println();
//            return sum;
//
//        }
//    }




//        System.out.println(method2(15,54,156));
//    }
//    static int method2(int a, int b, int c){
//      int result = (a+b+c)/3;
//      return result;
//    }
//
//}

//        System.out.println(method(5)); // 9 тема. 1 задание
//    }
//    static String method(int a) {
//        if (a%2 ==0) {
//            return "Четное число";
//        } else {
//            return "Не четное число";
//        }
//
//    }
//}



//            sumMax(new int[]{15,56,25,17,69,10,5});  // homework 8-1
//            sumMin(new int[]{15,5,58,45,99,48,21,3});
//    }
//    static void sumMax(int[] array1){
//
//        for (int i = 0; i < array1.length; i++) {
//            System.out.print(array1[i] +" ");
//        }
//        int maxValue = array1[0];
//        for (int i = 1; i < array1.length; i++) {
//            if (maxValue < array1[i]){
//                maxValue=array1[i];
//            }
//        }
//        System.out.println();
//        System.out.println("Max value is " +maxValue);
//    }
//    static void sumMin(int[] array2){
//        for (int i = 0; i < array2.length; i++) {
//            System.out.print(array2[i]+" ");
//        }
//        int minValue = array2[0];
//        for (int i = 0; i < array2.length; i++) {
//            if (minValue > array2[i]){
//                minValue = array2[i];
//            }
//        }
//        System.out.println();
//        System.out.println("Min value is " +minValue);
//    }
//
//}



//        task8(45,8,102);
//    }
//    static void task8(int a, int b, int c) { // Возрастающая последовательность
//          int x;
//          if (a>b){
//              x=a; a=b; b=x;
//          }else a=a;
//          if (b>a){
//              x=b; b=a; a=x;
//          }else b=b;
//          if (a>b){
//              x=a; a=b; b=x;
//          }else c=c;
//              System.out.println(""+a+" "+b+" "+c);
//    }
//}


//        task7(new int[]{5255, 5, 105});
//    }
//    static void task7(int arr[]) {    // Возрастающая последовательность
//
//        int temp = 0;
//        System.out.println("Sorted array elements");
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if(arr[i] > arr[j]){
//                    temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//            System.out.println(arr[i]);
//        }
//
//        }
//    }
//            System.out.println(Arrays.toString(arr)); // сортировка по возрастанию
//            Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));


//         task6(45);
//    }
//    static void task6(int a){
//        for (int i = 0; i < a; i++) {
//            System.out.print("* ");
//        }
//    }
//}
//        task(545,52);
//    }
//       static void task(int a, int b){
//        int c= a+b;
//        int result = c/2;
//           System.out.println("Среднее-арифметическое " +
//                   "значение чисел: " +a+ " и " +b+ " это " +result);
//
//    }
//}
//          arrays(new int[]{155,5458,6545});
//    }
//
//    static void arrays(int[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//    }
//
//}

//        name("Seitbek");
//    }
//    static void name(String str){
//        System.out.println("Salam "+str);
//    }


//    static void multiplication() {
//
//        Scanner number = new Scanner(System.in);
//        System.out.println("Enter your number:");
//        int a = number.nextInt();
//        for (int b = 1, c = 0; b <= 10; b++, c = a * b) {
//            System.out.println(a + "*" + b + "=" + c);
//        }








