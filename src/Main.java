public class Main {

    public static void main(String[] args) {
        int balanceBefore = 200; // изначальный баланс
        int addedPayment = 1200; // дополнтельно внесено на счет
        int balanceAfter = balanceBefore + addedPayment;

        int bonus;
        if (addedPayment > 1000) {
            bonus = addedPayment / 100;
        } else {
            bonus = 0;
        }
        System.out.println("начислено бонусных рублей " + bonus);
        System.out.println("изначальный баланс " + balanceBefore);
        System.out.println("внесено на счет " + bonus);
        System.out.println((bonus + balanceAfter) + " текущий баланс, с учетом бонусных рублей");

    }

}
