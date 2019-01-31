package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Написать программу, которая загадывает случайное число от 0 до 9 и пользователю
        // дается 3 попытки угадать это число. При каждой попытке компьютер должен сообщить,
        // больше ли указанное пользователем число, чем загаданное, или меньше.
        // После победы или проигрыша выводится запрос – «Повторить игру еще раз?
        // 1 – да / 0 – нет»(1 – повторить, 0 – нет).

        startGame();
    }
    static void startGame() { //Цикл запускающий/перезапускающий саму игру
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        char answer;

        game();

        do {
            System.out.println("Сыграть еще раз? y/n");
            while (!scanner.hasNext("[yn]")) {
                System.out.println("Не символ. Введите y/n:");
                scanner.next();
            }
            answer = scanner.next().charAt(0);

            if ('n' == answer) {
                exit = true;
            } else if ('y' == answer) {
                game();
            }
        } while (!exit);
    }

    private static void game() { //Непосредственно игра "Угадай число"
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int generate = random.nextInt(10);

        boolean win = false;
        int currentNum;

        for (int i = 0; i < 3; i++) {
            System.out.printf("Введите число от 0 до 9: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Не число. Введите число от 0 до 9:");
                scanner.next();
            }

            currentNum = scanner.nextInt();

            if (currentNum == generate) {
                win = true;
                break;
            } else if (currentNum > generate) {
                System.out.printf("%d > загаданное\n\n", currentNum);
            } else {
                System.out.printf("%d < загаданное\n\n", currentNum);
            }
        }

        if (win) {
            System.out.println("Вы победили!");
        } else System.out.printf("Вы проиграли. Ответ: %d\n", generate);
    }
}
