public class Main {
    public static void main(String[] args) {

        int startAmount = 250;
        int bonus = 0;
        int amount = 1350;
        //boolean bonus1 = amount > 1000;
        if (amount > 1000) {
            bonus = amount / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Сумма покупки");
        System.out.println(amount);
        System.out.println("Бонус за покупку");
        System.out.println(bonus);
        System.out.println("Итоговый счет");
        System.out.println(startAmount + amount + bonus);
    }
}