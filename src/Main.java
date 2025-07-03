public class Main {
    public static void main(String[] args) {
        int a = 100; //счет клиента, начальные данные
        int b; //бонусы
        int c = 1250; //сумма пополнения
        int d; //новый размер счета после пополнения
        d = a + c;

        if (c >= a)
        b = c / a;
                        else b = 0;

        System.out.println("состояние счета: " + d);
    System.out.println("начислено бонусов: " + b);

    }
}
