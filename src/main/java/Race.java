public class Race {
    static int distance = 0;
    static String winner = "";

    public static void getWinner(Automobile auto) {
        //Дистанция = время (24) * скорость (вводит пользователь)
        if (distance < 24 * auto.speed) {
            distance = 24 * auto.speed;
            winner = auto.name;
        }
    }
}
