package ru.netology.stats;

public class StatsService {

    public long sumSales(long[] sales) {
        long sumMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            sumMonth = sumMonth + sales[i];
        }
        return (int) sumMonth;
    }

    public long avgSumSales(long[] sales) {
        int avgSumMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            avgSumMonth = (int) (avgSumMonth + sales[i]);

        }
        return avgSumMonth / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int countMonthWithMinAvg(long[] sales) {

        int count = 0;
        int avgSumMonth = 0;


        for (int i = 0; i < sales.length; i++) {
            avgSumMonth = (int) (avgSumMonth + sales[i]);
        }
        for (int i = 0; i < sales.length; i++) {

            if (avgSumMonth / sales.length > sales[i]) {
                count = count + 1;
            }
        }
        return count;
    }

    public int countMonthWitMoreAvg(long[] sales) {

        int count = 0;
        int avgSumMonth = 0;


        for (int i = 0; i < sales.length; i++) {
            avgSumMonth = (int) (avgSumMonth + sales[i]);

        }

        for (int i = 0; i < sales.length; i++) {
            if (avgSumMonth / sales.length < sales[i]) {
                count = count + 1;
            }
        }
        return count;
    }
}


