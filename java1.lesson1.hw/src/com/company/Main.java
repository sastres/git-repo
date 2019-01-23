package com.company;

import java.util.Scanner;

public class Main { //публичный класс с именем Main

    public static void main(String[] args) { //публичный метод с именем main
        // Создать переменные типов: byte, short, int, long, float, double, char, boolean;
        int m = 10; //целочисленная переменная с именем "m" которой присвоено значение 10
        byte n = 20; //- - - - - - - - - - - - - - - - - "n"- - - - - - - - - - - - - - 20
        short l = 30; //- - - - - - - - - - - - - - - - - "l"- - - - - - - - - - - - - - 30
        long k = 40; //- - - - - - - - - - - - - - - - - - "k"- - - - - - - - - - - - - 40
        float dollar = 66.26F; //32-х битное действительное число с именем "dollar" и значением "66.26" (на 23.01.19)
        double euro = 75.25; //64-х битное действительное число с именем "euro" и значением "75.25" (на 23.01.19)
        char myChar = '\u00A9';
        System.out.println("All right's reserved " + myChar);
        boolean t = true; //переменная типа "boolean" с именем "t" которой присвоено значение "true"
        boolean f = false; //- - - - - - - - - "boolean"- - - - "f"- - - - - - - - - - - - - - "false"
        System.out.println("t=" + t + " " + "f=" + f);
        int result = calculate();
        System.out.println(result);
        boolean result2 = task10and20();
        System.out.println(result2);
        int result3 = isPositiveOrNegative();
        System.out.println(result3);
        boolean result4 = isNegative();
        System.out.println(result4);
        String result5 = greetings();
        

    }

     //Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
     // где a, b, c, d – входные параметры этого метода.
    public static int calculate() {
        System.out.println("Вычисляем выражение a * (b + (c / d))");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число а:");
        int a = scanner.nextInt();
        System.out.println("Введите число b:");
        int b = scanner.nextInt();
        System.out.println("Введите число c:");
        int c = scanner.nextInt();
        System.out.println("Введите число d:");
        int d = scanner.nextInt();
        int res = (a * (b + (c / d)));
        return res;
    }

    //Написать метод, принимающий на вход два числа и проверяющий,
    // что их сумма лежит в пределах от 10 до 20 (включительно),
    // если да – вернуть true, в противном случае – false.
    public static boolean task10and20() {
        System.out.println("Проверяем входит ли сумма двух чисел в заданный диапазон");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число x1:");
        int x1 = scanner.nextInt();
        System.out.println("Введите число x2:");
        int x2 = scanner.nextInt();
        int res = x1 + x2;
        if (res >= 10 && res <= 20){
            System.out.println("Сумма этих чисел входит в заданный диапазон");
            return true;
        }
        System.out.println("Сумма этих чисел не входит в заданный диапазон");
        return false;

    }

    //Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
    // положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
    public static int isPositiveOrNegative() {
        System.out.println("Проверяем положительное или отрицательное число");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число x:");
        int x = scanner.nextInt();
        if(x >= 0) {
            System.out.println("Введенное число положительное");
        } else {
            System.out.println("Введенное число отрицательное");
        }
        return x;
    }
    //Написать метод, которому в качестве параметра передается целое число.
    // Метод должен вернуть true, если число отрицательное.
    public static boolean isNegative() {
        System.out.println("Проверяем положительное или отрицательное число, опять О_о");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число x:");
        int x = scanner.nextInt();
        if(x <0 ) {
            return true;
        }
        return false;
    }
    //Написать метод, которому в качестве параметра передается строка, обозначающая имя.
    // Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
    public static String greetings() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше Имя:");
        String name = scanner.next();
        System.out.println("Привет " + name + "!");
        return name;
    }



}
