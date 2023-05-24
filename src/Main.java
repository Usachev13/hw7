public class Main {
    public static void main(String[] args) {
        /* task1 */
        int total = 0;
        int target = 2_459_000;
        int deposit = 15_000;
        while (total < target) {
            int month = 0;
            total += deposit;
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
        int time = 10;
        while (year <= time) {
            countryY = countryY + countryY * birthRate / 1000 - countryY * mortality / 1000;
            System.out.println("Год " + year + " численность населения составляет " + countryY);
            year++;
        }

        /* task4 */
        int contribution = 15000;
        int rate = 7;
        int sum = 12_000_000;
        int monthForTask4 = 1;
        while (contribution <= sum) {
            int percent = contribution / 100 * rate;
            contribution = contribution + percent;
            if (monthForTask4 % 6 == 0) {
                System.out.println("Месяц " + monthForTask4 + ", накопления составляют " + deposit);
            }
            monthForTask4++;

        }

        /* task6 */
        int term = 108;
        int monthForTask6 = 1;
        while (monthForTask6 <= term) {
            int percent = deposit / 100 * rate;
            deposit = deposit + percent;
            if (monthForTask6 % 6 == 0) {
                System.out.println("Месяц " + monthForTask6 + ", накопления составляют " + deposit);
            }
            monthForTask6++;
        }

        /* task7 */

        int daysPerMonth = 31;
        int dayFriday = 5;
        for (int friday = dayFriday; friday < daysPerMonth; friday += 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
        }

        /* task8 */
        int currentYear = 2023;
        int startsYear = currentYear - 200;
        int lastYear = currentYear + 100;
        int cometPerTime = 79;
        for (int cometYear = 0; cometYear <= lastYear; cometYear += cometPerTime) {
            if (cometYear >= startsYear) {
                System.out.println(cometYear);
            }
        }
    }
}