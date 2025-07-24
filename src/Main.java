public class Main {
    public static void main(String[] args) {
        int inputData = 500; //счет клиента, начальные данные
        int bonus; //бонусы
        int amount = 1325; //сумма пополнения
        int sum; //новый размер счета после пополнения
        sum = inputData + amount;
        if (amount >= 1000) {
            bonus = amount / 100;
        }
        else {
            bonus = 0;
        }
        System.out.println("состояние счета: " + sum);
        System.out.println("начислено бонусов: " + bonus);

    }
}
