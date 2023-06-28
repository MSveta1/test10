package ru.netology.stats;

public class StatsService {

    public long totalSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public long averageOfSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }

        return sum / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month++;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month++;
        }
        return minMonth + 1;
    }

    public long belowAverage(long[] sales) {
        long sumBelowAverage = 0;
        long average = averageOfSales(sales);
        for (long sale : sales) {
            if (sale < average) {
                sumBelowAverage++;
            }
        }
        return sumBelowAverage;
    }

    public long aboveAverage(long[] sales) {
        long sumAboveAverage = 0;
        long average = averageOfSales(sales);
        for (long sale : sales) {
            if (sale > average) {
                sumAboveAverage++;
            }
        }
        return sumAboveAverage;
    }
}
