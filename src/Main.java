public class Main {
    public static void main(String[] args) {

        int bilet = 13_676;

        int mile;
        if (bilet >= 0) {
            mile = 1;
        } else {
            mile = 0;
        }

        int bonus = bilet / 20 * mile;

        System.out.println("Стоимость билета " + bilet + " рублей");
        System.out.println("Начислено " + bonus + " бонусов");
    }
}