package com.company;

public class Main {

    public static void main(String[] args) {

        // Пишем, какое по счету число фибоначчи нам надо найти (Не больше 47)
        int fibNumber = 47;

        if (fibNumber<=47) {
            // Рекурсия
            System.out.println(fibRecur(fibNumber));
            // Цикл
            System.out.print(fibLoops(fibNumber));
        } else {
            System.out.println("48ое и далее число фибоначчи выходит за пределы типа переменной int в " +
                    "java (2,147,483,647), поэтому приложение не обращается к методам");
        }
    }


    public static int fibRecur(int num) {
        if (num <= 1) { return 0; }
        else if (num == 2) { return 1; }
        else {
            return fibRecur(num - 1) + fibRecur(num - 2);
        }
    }


    public static int fibLoops(int num) {
        if (num <= 1) { return 0; }
        else if (num == 2) { return 1; }

        int[] n = new int[]{0, 1, 0};

        for (int i = 2; i < num; i++) {
            n[2] = n[1] + n[0];
            n[0] = n[1];
            n[1] = n[2];
        }
        return n[1];
    }
}
