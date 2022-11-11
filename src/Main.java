public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int apples = 15;
        System.out.println("Значение переменной apple с типом int равно " + apples);
        byte cars = 100;
        System.out.println("Значение переменной cars с типом byte равно " + cars);
        short population = 30000;
        System.out.println("Значение переменной population с типом short равно " + population);
        long distance = 577543355697854321L;
        System.out.println("Значение переменной distance с типом long равно " + distance);
        float money = 24.7f;
        System.out.println("Значение переменной money с типом float равно " + money);
        double d = 63.4;
        System.out.println("Значение переменной d с типом double равно " + d);

        System.out.println("Задача 2");
        float f = 27.12f;
        long l = 987678965549L;
        double o = 2.786;
        boolean b = false;
        int i = 569;
        short h = -159;
        char c = 27897;
        byte y = 67;

        System.out.println("Задача 3");
        int totalStudents = 23;
        totalStudents += 27;
        totalStudents += 30;
        int sheetsOfPaper = 480;
        System.out.println("На каждого ученика рассчитано " + sheetsOfPaper / totalStudents + " листов бумаги");

        System.out.println("Задача 4");
        int bottles = 16;
        int minutes = 2;
        int productivityPerMinute = bottles / minutes;
        int theFirstTime = 20;
        System.out.println("За " + theFirstTime + " минут машины произвела бутылок " + theFirstTime * productivityPerMinute + " штук");
        int perDay = 24 * 60;
        System.out.println("За сутки машины произвела бутылок " + perDay * productivityPerMinute + " штук");
        int inThreeDays = perDay * 3;
        System.out.println("За 3 суток машины произвела бутылок " + inThreeDays * productivityPerMinute + " штук");
        int inOneMonth = perDay * 31;
        System.out.println("За месяц машины произвела бутылок " + inOneMonth * productivityPerMinute + " штук");

        System.out.println("Задача 5");
        int paintCans = 120;
        int whitePaint = 2;
        int brownPaint = 4;
        int totalClasses = paintCans / (whitePaint + brownPaint);
        whitePaint *= totalClasses;
        brownPaint *= totalClasses;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски");

        System.out.println("Задача 6");
        int bananas = 5 * 80;
        int milk = 2 * 105;
        int iceCream = 2 * 100;
        int eggs = 4 * 70;
        int weightGr = bananas + milk + iceCream + eggs;
        int grPerKg = 1000;
        float weightKg = weightGr/(float)grPerKg;
        System.out.println("Вес спорт завтрака равен " + weightKg + " кг");

        System.out.println("Задача 7");
        int needToReset = 7 * 1000;
        int loss1 = 250;
        int loss2 = 500;
        int average = (needToReset / loss2) % (needToReset / loss1);
        System.out.println("Если спортсмен будет терять по " + loss1 + " гр, то " + (needToReset / loss1) + " дней ему потребуется.");
        System.out.println("Если спортсмен будет терять по " + loss2 + " гр, то " + (needToReset / loss2) + " дней ему потребуется.");
        System.out.println(average + " может потребоваться дней в среднем, чтобы добиться результата похудения.");

        System.out.println("Задача 8");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;

        int newSalaryMasha = salaryMasha * (10 + 100) / 100;
        int newSalaryDenis = salaryDenis * (10 + 100) / 100;
        int newSalaryKristina = salaryKristina * (10 + 100) / 100;

        int annualIncomeMasha = salaryMasha * 12;
        int annualIncomeDenis = salaryDenis * 12;
        int annualIncomeKristina = salaryKristina * 12;

        int newAnnualIncomeMasha = newSalaryMasha * 12;
        int newAnnualIncomeDenis = newSalaryDenis * 12;
        int newAnnualIncomeKristina = newSalaryKristina * 12;

        int differenceAnnualIncomeM = newAnnualIncomeMasha % annualIncomeMasha;
        int differenceAnnualIncomeD = newAnnualIncomeDenis % annualIncomeDenis;
        int differenceAnnualIncomeK = newAnnualIncomeKristina % annualIncomeKristina;

        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + differenceAnnualIncomeM + " рублей.");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + differenceAnnualIncomeD + " рублей.");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + differenceAnnualIncomeK + " рублей.");

    }
}