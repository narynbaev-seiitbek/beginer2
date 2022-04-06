package Peaksoft.Lessons;

public class Varargs {

    public static void main(String[] args) {

        System.out.println("Общая сумма: " +varargs(15,18,66,54,454,211));
    }

    static int varargs(int ...args){
        int sum =0;
        for (int i = 0; i < args.length; i++) {

            System.out.println(args[i]);
            sum=sum+args[i];
        }
        return sum;
    }
}

