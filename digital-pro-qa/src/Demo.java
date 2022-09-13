public class Demo {

    public static void main(String[] args) {
        //тип_данных название_переменной = значение
        int number = 5;

        //статическая типизация
        short digit = 1;
        digit = 3;
        digit = 'c';
        //digit = 124982094;

        System.out.println(digit);

        //const
        final String string = "Hello World!";
        //string = "Hi!";

        //типы данных
        byte byteValue = 1;
        short shortValue = -20;
        int intValue = -1234;
        long longValue = 1029222;

        char charValue = 'r';
        String stringValue = "Text^2&";

        boolean bool = true;

        double doubleValue = 12.8;
        float floatValue = 15.89232323F;

        //арифметические операции
        int sum = 2 + 2;
        int result = 20 - 5;
        int proiz = 3 * 5;

        int del = 20 / 4; //5
        int del2 = 21 / 4; //5
        int del3 = 21 % 4; //1

        //2 * (3 + 5)
        int result2 = 2 * (3 + 5);

        int increment = 1;
        increment++; // increment = increment + 1;
        ++increment;

        int sum2 = 2 - increment++; //sum2 = 2 - increment; increment = increment + 1;
        int sum3 = 2 - ++increment; //increment = increment + 1; sum2 = 2 - increment;

        System.out.println(sum2);
        System.out.println(sum3);

        //Вывод
        //println printf print
        System.out.println("It is a string");
        System.out.print(result2 + ", ");
        System.out.print(del3 + "\n");
        System.out.printf("I am %d old\n", 90);
        System.out.printf("I am %d old\n", del2);

        //Преобразование типов данных
        char c = 'c';
        System.out.println(c);

        double result3 = 5 / 4.0;
        System.out.println(result3);

        int result4 = (int) 56.7;
        System.out.println(result4);
    }
}
