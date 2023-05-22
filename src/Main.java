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

        /* task2 */
        int num = 1;
        while (num <= 10){
            System.out.print(num + " ");
            num++;
        }
        System.out.println();
        int num2 = 10;
        while (num2 >= 1){
            System.out.print(num2 + " ");
            num2--;
        }
    }
}