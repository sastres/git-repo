import java.util.Random;
import java.util.Scanner;

public class Main {
    public static char[][] map; //представляет само поле из символов char
    public static final int SIZE = 3; //размер поля. Поскольку оно квадратное, достаточно 1-го измерения
    public static final int DOTS_TO_WIN = 3; //Сколько нужно точек, чтобы выиграть

    public static final char DOT_EMPTY = '•'; //символ пустого поля
    public static final char DOT_X = 'X'; //отрисовка крестика
    public static final char DOT_O = 'O'; //отрисовка нолика

    public static final Scanner sc = new Scanner(System.in);
    public static final Random rand = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

    //заполняем наш массив точками
    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    //печатаем наши массив на экране. Первый цикл печатает цифры 1 2 3.
    //последующие циклы печатают 1 2 3 по вертикали и выводят точки на экран
    //Выводится наоборот. Поэтому в дальнейшем мы присваиваем [y][x], а не [x][y].
    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    //ход человек. Считываем данные с экрана и приводим их к int - целому числу.
    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            //Ловим ошибку, если пользователь ввел не число.
            //В этом случае присваем отрицательные значения.
            try {
                x = sc.nextInt() - 1;
                y = sc.nextInt() - 1;
            } catch (Exception exc) {
                System.out.println("Ввести можно только цифры!");
                x = -1;
                y = -1;
            }
        } while (!isCellValid(x, y)); //"!"-означает отрицание,логическое "не". true -> false и наоборот
        map[y][x] = DOT_X; //эту строчку не выполним, пока не завершится цикл выше
    }

    //Метод проверять, заполнено ли поле целиком крестиками и ноликами
    //Если в циклах мы нашли хотя бы одну точку, то карта не полная
    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }


    //проверяем на валидность наши координаты. Если они выходят за пределы массива, то они не валидны.
    //также если по координатам не стоит точка (DOT_EMPTY), то проверка также не пройдена.
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        return map[y][x] == DOT_EMPTY;
    }

    //Ход компьютера. Мы берем случайным образом x & y, ограничиваясь размером массива.
    //Если вдруг значение, взятое случайным образом, не валидное, пробуем сгенерировать новые
    public static void aiTurn() {
        try {
            System.out.println("Хм... Что если... 101110101101");
            Thread.sleep(1500);
        } catch (Exception ignored) {}
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    //Проверяем победу. Проверяем все столбцы, строки и диагонали.
    //Если в одной из проверок одинаковые символы, то это победа.
    public static boolean checkWin(char symbol) {
        if(map[0][0] == symbol && map[0][1] == symbol && map[0][2] == symbol) return true;
        if(map[1][0] == symbol && map[1][1] == symbol && map[1][2] == symbol) return true;
        if(map[2][0] == symbol && map[2][1] == symbol && map[2][2] == symbol) return true;
        if(map[0][0] == symbol && map[1][0] == symbol && map[2][0] == symbol) return true;
        if(map[0][1] == symbol && map[1][1] == symbol && map[2][1] == symbol) return true;
        if(map[0][2] == symbol && map[1][2] == symbol && map[2][2] == symbol) return true;
        if(map[0][0] == symbol && map[1][1] == symbol && map[2][2] == symbol) return true;
        if(map[2][0] == symbol && map[1][1] == symbol && map[0][2] == symbol) return true;

        return false;
    }

}
