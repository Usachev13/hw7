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
        int toBeBorn = countryY / 1000 * 17;
        int toBeDie = countryY / 1000 * 8;
        int year = 1;
        while (year <= 10) {
            countryY = countryY + toBeBorn - toBeDie;
            toBeBorn = countryY / 1000 * 17;
            toBeDie = countryY / 1000 * 8;
            System.out.println("Год " + year + " численность населения составляет " + countryY);
            year++;
        }

        /* task4 */
        int deposit = 15000;
        int percent = deposit / 100 * 7;
        int Month = 1;
        while (deposit <= 12_000_000) {
            deposit = deposit + percent;
            percent = deposit / 100 * 7;
            if (Month % 6 == 0) {
                System.out.println("Месяц " + Month + ", накопления составляют " + deposit);
            }
            Month++;

        }

        /* task6 */
        while (Month <= 108){
            deposit = deposit + percent;
            percent = deposit / 100 * 7;
            if (Month % 6 == 0) {
                System.out.println("Месяц " + Month + ", накопления составляют " + deposit);
            }
            Month++;
        }

        /* task7 */

        int daysPerMonth = 31;
        for (int friday = 5; friday < daysPerMonth; friday += 7) {
            for (int i = 1; i < daysPerMonth; i++) {
                if (i == friday) {
                    System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
                }
            }
        }

        /* task8 */
        int cometYear;
        int startsYear;
        int lastYear = 2123;
        for (cometYear = 0; cometYear <= lastYear; cometYear += 79){
            for (startsYear = 1823; startsYear <= lastYear; startsYear++){
                if (startsYear == cometYear){
                    System.out.println(cometYear);
                }
            }
        }
    }
}