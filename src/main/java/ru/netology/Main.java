package ru.netology;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Igor Khristiuk
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getInstance();

        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные");

        System.out.println("Введите размер списка:");
        int size = scanner.nextInt();
        System.out.println("Введите верхнюю границу для значений:");
        int maxValue = scanner.nextInt();

        logger.log("Создаём и наполняем список");
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            numbers.add(random.nextInt(maxValue));
        }
        System.out.print("Вот случайный список: ");
        printNumb(numbers);

        logger.log("Просим пользователя ввести данные для фильтрации");
        System.out.println("Введите данные для фильтрации");
        Filter filter = new Filter(scanner.nextInt());
        logger.log("Запускаем фильтрацию");
        List<Integer> result = filter.filterOut(numbers);
        logger.log("Выводим результат на экран");
        System.out.print("Отфильтрованный список: ");
        printNumb(result);
        logger.log("Завершаем программу");
    }

    public static void printNumb(List<Integer> source) {
        for (Integer integer : source) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }
}
