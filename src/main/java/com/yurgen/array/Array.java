package com.yurgen.array;
import java.util.Scanner;
public class Array {
    /**
     * Пользователь вводит размер и элементы масива
     * <p>
     * Создаем второй масив и заполняем его первым умножив каждый элемент на 2
     * Выводим пользователю результат в формате:
     * "Ты ввел X * 2 = Y"
     * Где Х - число из первого масива, а У - соответствуещее число из второго масива
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Укажите длину линейки: ");
        int size = in.nextInt();
        Integer[] mas = new Integer[size];
        for (int i = 0; i < mas.length; i++) {
            System.out.print("Введите єлемен: ");
            mas[i] = in.nextInt();
            System.out.println(String.format("Ты ввел %d * 2 = %d", mas[i], mas[i] * 2));
        }
    }
}

