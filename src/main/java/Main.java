import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final int AMOUNT_CARS = 3;
        final int MAX_SPEED = 250;
        final int MIN_SPEED = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Приветствую на гонке «24 часа Ле-Мана»!");
        ArrayList<Automobile> autoList = new ArrayList<>();

        for (int i = 0; i < AMOUNT_CARS; i++) {

            System.out.println("— Введите название машины №" + (i + 1) + ":");
            String name = scanner.next();

            System.out.println("— Введите скорость машины №" + (i + 1) + " в параметрах от " + MIN_SPEED + " по " + MAX_SPEED + " км/ч:");
            while (true) {
                String input = scanner.nextLine();
                if (input.isEmpty()) {
                    continue;
                }
                try {
                    int speed = Integer.parseInt(input);
                    if (speed >= MIN_SPEED && speed <= MAX_SPEED) {
                        Automobile auto = new Automobile(name, speed);
                        autoList.add(auto);
                        Race.getWinner(auto);
                        System.out.println("Приветствуем нового учавстника гонки: \n" + autoList.get(i).name + " со скоростью " + autoList.get(i).speed);
                        break;
                    } else {
                        System.out.println("Введена скорость вне допустимого диапозона. Попробуй ещё. \nЯ в тебя верю, на этот раз у тебя обязательно получится!");
                    }
                } catch (NumberFormatException error) {
                    System.out.println("Введены некорректное значение скорости. Попробуй ещё. \nЯ в тебя верю, на этот раз у тебя обязательно получится!");
                }
            }
        }
        System.out.println("\nПриветствуем победителя гонки: \n" + Race.winner + " проехал " + Race.distance + " км.");
    }
}
