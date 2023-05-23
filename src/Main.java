public class Main {
    public static void main(String[] args) {
        /* task1 */
        int total = 0;
        int month = 0;
        while (total < 2_459_000) {
            total += 15_000;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }

        /* task2 */
        int num = 1;
        while (num <= 10) {
            System.out.print(num + " ");
            num++;
        }
        System.out.println();
        int num2 = 10;
        while (num2 >= 1) {
            System.out.print(num2 + " ");
            num2--;
        }
        System.out.println();

        /* task3 */
        int countryY = 12_000_000;
        int birthRate = 17;
        int mortality = 8;
        int year = 1;
        while (year <= 10) {
            countryY = countryY + countryY * birthRate / 1000 - countryY * mortality / 1000;
            System.out.println("Год " + year + " численность населения составляет " + countryY);
            year++;
        }

        /* task4 */
        int deposit = 15000;
        int rate = 7;
        int Month = 1;
        int sum = 12_000_000;
        while (deposit <= sum) {
            int percent = deposit / 100 * rate;
            deposit = deposit + percent;
            if (Month % 6 == 0) {
                System.out.println("Месяц " + Month + ", накопления составляют " + deposit);
            }
            Month++;

        }

        /* task6 */
        while (Month <= 108) {
            int percent = deposit / 100 * rate;
            deposit = deposit + percent;
            if (Month % 6 == 0) {
                System.out.println("Месяц " + Month + ", накопления составляют " + deposit);
            }
            Month++;
        }

        /* task7 */

        int daysPerMonth = 31;
        for (int friday = 5; friday < daysPerMonth; friday += 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
        }

        /* task8 */
        int currentYear = 2023;
        int startsYear = currentYear - 200;
        int lastYear = currentYear + 100;
        for (int cometYear = 0; cometYear <= lastYear; cometYear += 79) {
            if (cometYear >= startsYear) {
                System.out.println(cometYear);
            }
        }
    }
}