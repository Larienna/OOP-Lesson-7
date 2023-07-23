package Task2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Worker[] workers = new Worker[1]; // создание массива из 5 элементов типа Worker
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < workers.length; i++) {
            System.out.println("Введите данные работника: " + (i + 1));
            System.out.print("Фамилия и инициалы: ");
            String fullName = scanner.nextLine();

            System.out.print("Должность: ");
            String position = scanner.nextLine();

            System.out.print("Год поступления на работу: ");
            String startYearInput = scanner.nextLine();

            try {
                int startYear = Integer.parseInt(startYearInput);
                workers[i] = new Worker(fullName, position, startYear);
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели некорректное значение года. Год должен быть числом.");
                i--; // повторяем ввод данных для i-го работника
            }
        }

        Arrays.sort(workers, Comparator.comparing(Worker::getFullName));

        System.out.print("Введите значение стажа работы: ");
        int experienceThreshold = scanner.nextInt();
        scanner.nextLine(); // считываем оставшийся символ новой строки

        System.out.println("Работники с опытом работы больше " + experienceThreshold + " лет:");
        for (Worker worker : workers) {
            if ((2023 - worker.getStartYear()) > experienceThreshold) {
                System.out.println(worker.getFullName());
            }
        }
    }
}
