public class Main {
    public static void main(String[] args) {

        int ticket = 13_676;

        int miles;
        if (ticket >= 0) {
            miles = 1;
        } else {
            miles = 0;
        }

        int bonus = ticket / 20 * miles;

        System.out.println("Стоимость билета " + ticket + " рублей");
        System.out.println("Начислено " + bonus + " бонусов");
    }
}