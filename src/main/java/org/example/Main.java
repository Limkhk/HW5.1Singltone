package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Scanner in = new Scanner(System.in);
        logger.log("Запуск программы");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.println("Введите размер списка: ");
        int N = in.nextInt();
        System.out.println("Введите верхнюю границу для значений: ");
        int M = in.nextInt();
        logger.log("Создаём и наполняем список");
        List<Integer> randomList = new ArrayList<>(N);
        int count = N;
        Random random = new Random();
        while (count > 0) {
            randomList.add(random.nextInt(M));
            count--;
        }
        System.out.println("Вот случайный список: " + randomList);
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.println("Введите порог для фильтра: ");
        int f = in.nextInt();
        Filter filter = new Filter(f);
        logger.log("Запускаем фильтрацию");
        List<Integer> resultList = filter.filterOut(randomList);
        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + resultList);
        logger.log("Завершаем программу");
    }
}