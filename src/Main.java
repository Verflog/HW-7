public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int interestSavings = 0;
        short numberOfMonth = 0;
        while (interestSavings < 2_459_000) {
            interestSavings += 15_000;
            interestSavings *= 1.01;
            numberOfMonth += 1;
            System.out.println("Месяц номер " + numberOfMonth + ", cумма накоплений равна " + interestSavings);
        }
        System.out.println("Задача 2");
        int counter = 1;
        while (counter <= 10) {
            System.out.print(counter + " ");
            counter++;
        }
        System.out.println(" ");
        for (counter = 10; counter >= 1; counter--) {
            System.out.print(counter + " ");
        }
        System.out.println(" ");
        System.out.println("Задача 3");
        int population = 12_000_000;
        byte birthRatePerThousand = 17;
        byte deathRatePerThousand = 8;
        for (byte year = 1; year <= 10; year++) {
            population += population / 1000 * birthRatePerThousand;
            population -= population  / 1000 * deathRatePerThousand;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
        System.out.println("Задача 4");
        int savings = 15_000;
        float percent = 1.07f;
        int month = 0;
        while (savings < 12_000_000) {
            savings *= percent;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений составляет " + savings);
        }
        System.out.println("Задача 5");
        savings = 15_000;
        month = 0;
        while (savings < 12_000_000) {
            savings *= percent;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений составляет " + savings);
            }
        }
        System.out.println("Задача 6");
        savings = 15_000;
        for (byte semester = 1; semester <= 9 * 2; semester++) {
            for (month = 1; month <= 6; month++) {
                savings *= percent;
            }
            System.out.println("Полугодие " + semester + ", сумма накоплений составляет " + savings);
        }
        System.out.println("Задача 7");
        byte fridayDate = 4;
        while (fridayDate < 31) {
            System.out.println("Сегодня пятница, " + fridayDate + "-е число. Необходимо подготовить отчет");
            fridayDate += 7;
        }
        System.out.println("Задача 8");
        short twoHundredYearsBefore = 2024 - 200;
        short hundredYearsAfter = 2024 + 100;
        short cometYear = 0;
        while (cometYear <= hundredYearsAfter) {
            cometYear += 79;
            if (cometYear >= twoHundredYearsBefore && cometYear <= hundredYearsAfter) {
                System.out.println(cometYear);
            }
        }
    }
}