public class Task1 {

    //1. С некоторого момента прошло 234 дня. Сколько полных недель прошло за этот период? А месяцев?
    public static void main(String[] args) {
        int days = 23;
        int weeks = days / 7;
        int months = days / 30;

        System.out.println("Количество недель = " + weeks);
        System.out.println("Количество месяцев = " + months);
    }
}
