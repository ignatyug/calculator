package com.yurgen.array;

public class Array {
    /**
     * Пользователь вводит размер и элементы масива
     * <p>
     * Создаем второй масив и заполняем его первым умножив каждый элемент на 2
     * Выводим пользователю результат в формате:
     * "Ты ввел X * 2 = Y"
     * Где Х - число из первого масива, а У - соответствуещее число из второго масива
     */
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Укажите длину линейки: ");
//        int size = in.nextInt();
//        Integer[] mas = new Integer[size];
//        for (int i = 0; i < mas.length; i++) {
//            System.out.print("Введите єлемен: ");
//            mas[i] = in.nextInt();
//            System.out.println(String.format("Ты ввел %d * 2 = %d", mas[i], mas[i] * 2));
//        }
//    }
    public static void main(String[] args) {
        int number = 10;
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println();

        int[] numbers1 = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int X : numbers1) {
            sum = sum + X;
        }
        System.out.println(sum);

        System.out.println();

        String[] strings = new String[3];
        strings[0] = "Hello";
        strings[1] = "";
        strings[2] = "Vasy";

        for (String str : strings) {
            System.out.println(str);

        }
        System.out.println();

        int[][] array = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }


    }
}

