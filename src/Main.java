public class Main {
    public static void main(String[] args) {
        int inputData = 100; //счет клиента, начальные данные
        int bonus; //бонусы
        int amount = 1250; //сумма пополнения
        int sum; //новый размер счета после пополнения
        sum = inputData + amount;
        {
            if (amount >= inputData)
                bonus = amount / inputData;
            else bonus = 0;
        }
        System.out.println("состояние счета: " + sum);
        System.out.println("начислено бонусов: " + bonus);

    }
}
