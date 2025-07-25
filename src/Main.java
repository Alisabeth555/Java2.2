public class Main {
    public static void main(String[] args) {
        int inputData = 100; //счет клиента, начальные данные
        int bonus; //бонусы
        int amount = 1100; //сумма пополнения
        int sum; //новый размер счета после пополнения

        if (amount >= 1000) {
            bonus = amount / 100;
        } else {
            bonus = 0;
        }
        sum = inputData + amount + bonus;
        System.out.println("состояние счета: " + sum);
        System.out.println("начислено бонусов: " + bonus);

    }
}
