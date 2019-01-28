package com.company;

public class Main {



    public static void main(String[] args) {



    }
    // Задать целочисленный массив, состоящий из элементов 0 и 1. Например:
    // [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void invertArray() {
        int[] arr = {1, 0, 1, 0, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) arr[i] = 0;
            else arr[i] = 1;
        }
        System.out.println("Первое задание: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + "-" + arr[i]);
        }

    }
    //Задать пустой целочисленный массив размером 8.
    //С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    public static void fillArray(){
        int[] array = new int[8];
        int a = 0;
        int fill = array.length;
        System.out.println(" ");
        System.out.println("Второе задание: ");

        for (int i =0; i < fill; ++i, a = a + 3){
            array[i] = a;
            System.out.println(+array[i] + "");
            System.out.println(" ");

        }

    }
    //Задать массив [1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1] пройти по нему циклом,
    // и числа меньшие 6 умножить на 2;
    public static void changeArray(){
        int[] w = {1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i = 0; i < w.length; i++){
            if (w[i] < 6)
                w[i] = w[i]*2;
        }
        System.out.println(" ");
        System.out.println("Третье задание: ");
        for (int i = 0; i <w.length; i++) {
            System.out.print(+w[i] + ", ");
        }
    }


}

