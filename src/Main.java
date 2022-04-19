public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//задание 1
        byte a = 5;
        short b = 10;
        int c = 40;
        long d = 2L;

        float f = 3.5f;
        double g = 5.65;

        boolean h = a < 10;

        char j = 40;
        System.out.println(h);

//задание 2
        double fighterWeight1 = 78.2;
        double fighterWeight2 = 82.7;
        double totalWeight = fighterWeight1 + fighterWeight2;
        System.out.println("Общий вес бойцов " + totalWeight + "кг");
        double differenceWeight = fighterWeight2 - fighterWeight1;
        System.out.println("Разница в весе " + differenceWeight + "кг");

        //Задание 3

        var banana = 80;
        var milk = 105;
        var iceСream = 100;
        var egg = 70;

        var allBanana = banana * 5;
        var allMilk = milk * 2;
        var allIceCream = iceСream * 2;
        var allEgg = egg * 4;
        var allBreakfast = allBanana + allMilk + allIceCream + allEgg;
        int grPerKg = 1000;
        double allBreakfastInKg = allBreakfast/(double)grPerKg;
        System.out.println("Вес завтрака " + allBreakfastInKg + "кг");

        //Задание 4

        var weightSportsman = 7;
        var weightSportsmanInG = weightSportsman * 1000;
        var system1 = 250;
        var system2 = 500;
        var changeWeight1 = weightSportsmanInG/system1;
        System.out.println("Количество дней, если будет худеть по 250г " +changeWeight1);
        var changeWeight2 = weightSportsmanInG/system2;
        System.out.println("Количество дней, если будет худеть по 500г " +changeWeight2);
        var totalDays = changeWeight1 + changeWeight2;
        var averageNumberOfDays = totalDays/2;
        System.out.println("Среднее количество дней, за которое изменится вес " + averageNumberOfDays);

        //Задание 5

        var mashaSalary = 67760;
        var dashaSalary = 83690;
        var kristinaSalary = 76230;
        double differenceMashaSalary = mashaSalary * 0.1;
        double differenceDashaSalary = dashaSalary * 0.1;
        double differenceKristinaSalary = kristinaSalary * 0.1;
        var finalSalaryMasha = mashaSalary + differenceMashaSalary;
        var finalSalaryDasha = dashaSalary + differenceDashaSalary;
        var finalSalaryKristina = kristinaSalary + differenceKristinaSalary;
        var oldYearSalaryMasha = mashaSalary * 12;
        var oldYearSalaryDasha = dashaSalary * 12;
        var oldYearSalaryKristina = kristinaSalary * 12;
        var newYearSalaryMasha = finalSalaryMasha * 12;
        var newYearSalaryDasha = finalSalaryDasha * 12;
        var newYearSalaryKristina = finalSalaryKristina * 12;
        var differenceYearSalaryMasha = newYearSalaryMasha - oldYearSalaryMasha;
        var differenceYearSalaryDasha = newYearSalaryDasha - oldYearSalaryDasha;
        var differenceYearSalaryKristina = newYearSalaryKristina - oldYearSalaryKristina;
        System.out.println("Маша получает в месяц " + finalSalaryMasha + ". Годовой доход вырос на " + differenceYearSalaryMasha);
        System.out.println("Даша получает в месяц " + finalSalaryDasha + ". Годовой доход вырос на " + differenceYearSalaryDasha);
        System.out.println("Кристина получает в месяц " + finalSalaryKristina + ". Годовой доход вырос на " + differenceYearSalaryKristina);
    }
}