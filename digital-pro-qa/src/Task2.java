public class Task2 {
    //2. Дано двузначное число 39.Найти:
    //    - число десятков в нем;
    //    - число единиц в нем;
    //    - сумму его цифр;
    //    - произведение его цифр.
    public static void main(String[] args) {
        int number = 39;

        int decimals = number / 10;
        int units = number % 10;
        int sum = decimals + units;
        int product = decimals * units;

        System.out.printf(
                "Количество десятков - %d, количество единиц - %d\nСумма цифр - %d, произведение цифр - %d",
                decimals,
                units,
                sum,
                product
        );
    }
}
