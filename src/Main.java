public class Main {
    public static void main(String[] args) {
        /* task1 */
        int total = 0;
        int month = 0;
        while (total < 2_459_000){
            total += 15_000;
            month += 1;
            System.out.println("Месяц " + month +", сумма накоплений равна " + total + " рублей");
        }
    }
}