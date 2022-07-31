import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*PrintMenu.printMenu();
        Scanner scanner = new Scanner(System.in);
        System.out.println(Integer.parseInt(scanner.nextLine())); *//*тут мы с помощью класса-обертки вызываем метод, который
        преобразовывает строку в целое число*//*
        // scanner.nextLine();
        System.out.println(scanner.nextLine());*/

        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker();
        System.out.println("Добро пожаловать в Счётчик калорий!");

        while (true) {
            PrintMenu.printMenu();
            String command = scanner.nextLine();
            if (command.equals("1")) {
                System.out.println("Введите месяц от 0 до 11 (где 0 - январь, 1 - февраль и т.д.), номер дня от 1 до 30, " +
                        "количество пройденных шагов. Пример: 11 25 10000");
                String command1 = scanner.nextLine();
                String[] str = command1.split(" ");
                stepTracker.saveSteps(Integer.parseInt(str[0]), Integer.parseInt(str[1]), Integer.parseInt(str[2]));
            } else if (command.equals("2")) {
                System.out.println("Для вывода статистики введите месяц от 0 до 11 (где 0 - январь, 1 - февраль и т.д.)");
                stepTracker.printStatistic(Integer.parseInt(scanner.nextLine()));
            } else if (command.equals("3")) {
                System.out.println("Введите новую цель по количеству шагов");
                stepTracker.setStepsGoal(Integer.parseInt(scanner.nextLine()));
            } else if (command.equals("0")) {
                System.out.println("Выход");
                break;
            }
            }

        }
}
