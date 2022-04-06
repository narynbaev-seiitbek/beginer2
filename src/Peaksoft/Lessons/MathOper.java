package Peaksoft.Lessons;

import java.util.Random;
import java.util.Scanner;

public class MathOper {

    public static void main(String[] args) {


//        Scanner num = new Scanner(System.in);//Home Work 2-1
//        int num1, num2, num3, result1;
//        double num4,result2;
//        System.out.print("Введите цифру:");
//        num1 = num.nextInt();
//        System.out.print("Введите цифру:");
//        num2 = num.nextInt();
//        System.out.print("Введите цифру:");
//        num3 = num.nextInt();
//        System.out.print("Введите цифру");
//        num4 = num.nextDouble();
//        result1 = num1 + num2 + num3;
//        result2 = result1 / num4;
//        System.out.println("Результат:" + num1 + "+" + num2 + "+" + num3 + "="+ result1);
//        System.out.println("Результат:" + num1 + "*" + num2 + "*" + num3 + "="+ result1);
//        System.out.println("Результат:" + num1 + "+" + num2 + "+" + num3 + "/" + num4 + "="+ result2);
//    }
//}

//        Scanner input = new Scanner(System.in); // Превращение секунды в час и минут
//        int seconds;
//        int minutes;
//        int hours;
//        System.out.print("Enter the number of seconds : ");
//        seconds = input.nextInt();
//        hours = seconds / 3600;
//        minutes = (seconds % 3600) / 60;
//        int seconds_output = (seconds % 3600) % 60;
//
//        System.out.println("The time entered in hours,minutes and seconds is:");
//        System.out.println(hours + " hours :" + minutes + " minutes:" + seconds_output + " seconds");
//
//    }
//}

//        Scanner time = new Scanner(System.in);//Home Work 3-1
//
//        System.out.print("Enter your time: ");
//        int hour = time.nextInt();
//        int minute = time.nextInt();
//        int second = time.nextInt();
//
//        int second3 = 3600;
//        int minute2 = 60;
//
//        int result = hour * second3;
//        int result3 = minute * minute2;
//        int result4 = result + result3 + second;
//
//        System.out.println("Результат:" + " " + result4 + " " + "секунд");
//    }
//}

//        Scanner number = new Scanner(System.in);//Home work 3-2 Разделяет на три отдельных числа
//        int num = number.nextInt();
//        int num1 = num / 100;
//        int num2 = (num / 10) % 10;
//        int num3 = num % 10;
//        System.out.println(num1 + "," + num2 + "," + num3);
//    }
//}

//        Scanner scan = new Scanner(System.in);
//        int num1 = scan.nextInt();
//        int num2 = 5;
//        int result = num1 * num2;
//        System.out.println(num1 + "*" + num2 + "=" + result);
//        int num3 = 3;
//        int result2 = result - num3;
//        System.out.println(result + "-" + num3 + "=" + result2);
//        int num4 = 10;
//        int result3 = result2 - num4;
//        System.out.println(result2 + "-" + num4 + "=" + result3);
//    }
//}
//
//        Scanner number = new Scanner(System.in);//max, min
//        int num = number.nextInt();
//        int num2 = number.nextInt();
//        int result = Math.max(num, num2);
//        System.out.print(result);
//    }
//}

//        int num = 5;
//        int num2 = 4;
//        System.out.print("result:" + " " + Math.pow(num, num2));//степень
//    }
//}
//        double num1 = 5.5;
//        double num2 = 7.5;
//        double num3 = 8.2;
//        System.out.println("result:" + Math.ceil(num1));//округление вверх
//        System.out.println("result:" + Math.floor(num2));//округленние вниз
//        System.out.println("result:" + Math.round(num3));//округление вниз
//    }
//}

//        double a = Math.sqrt(55);//корень
//        System.out.println(a);
//        double b = Math.pow(5, 5);//степень
//        System.out.println(b);
//        double d = Math.round(5.5); //округление
//        System.out.println(d);
//        double c = Math.ceil(0.9);//округление вверх
//        System.out.println(c);
//        double e = Math.floor(0.9);//округление вниз
//        System.out.println(e);
//    }
//}

        //Random
//        Random random = new Random();
//        int num1 = random.nextInt(30);
//        System.out.println(num1);
//        int num2 = 5;
//        System.out.println(num1 + num2);
//    }
//}

//        Scanner scanner = new Scanner(System.in);//сложение
//        System.out.print("Введите цифры:");
//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//        int num3 = scanner.nextInt();
//        int result = num1 + num2 + num3;
//        System.out.println("Результат:" + num1 + "+" + num2 + "+" + num3 + "=" + result);
//
//        Scanner scanner2 = new Scanner(System.in);//умножение
//        System.out.print("Введите цифры:");
//        int num4 = scanner.nextInt();
//        int num5 = scanner.nextInt();
//        int num6 = scanner.nextInt();
//        int result2 = num1 * num2 * num3;
//        System.out.println("Результат:" + num4 + "*" + num5 + "*" + num6 + "=" + result2);
//
//        Scanner scanner3 = new Scanner(System.in);//сложение и деление
//        System.out.print("Введите цифры:");
//        int num7 = scanner.nextInt();
//        int num8 = scanner.nextInt();
//        int num9 = scanner.nextInt();
//        double num10 = scanner.nextInt();
//        int result3 = num1 + num2 + num3;
//        double result4;
//        result4 = result3 / num10;
//        System.out.println("Результат:" + "(" + num4 + "+" + num5 + "+" + num6 + ")" + "/" + num10 + "=" + result4);
//    }
//}

//        Scanner number = new Scanner(System.in);
//        int a = number.nextInt();
//        int b = a / 10000 % 10;
//        int c = a / 1000 % 10;
//        int d = a / 100 % 10;
//        int e = a / 10 % 10;
//        int f = a % 10;
//        System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f);
//
//    }
//}
    }
}