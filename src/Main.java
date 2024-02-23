public class Main {
    public static void main(String[] args) {

        int bilet = 13_676;
        boolean isRegistered = true;

        int mile;
        if (isRegistered) {
            mile = 1;
        }
        else {
            mile = 0;
        }

        int bonus = bilet / 20 * mile;

        System.out.println("Стоимость билета " + bilet + " рублей");
        System.out.println("Начислено " + bonus + " бонусов");
    }
}