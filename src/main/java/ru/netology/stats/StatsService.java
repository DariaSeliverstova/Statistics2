package ru.netology.stats;

public class StatsService {
    public long calculateSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long averageSales(long[] sales) {
        long sum = calculateSum(sales);
        return sum / sales.length;

    }

    public long maxSalesMoth(long[] sales) {
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

    public long minSalesMoth(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int numberMonthMin(long[] sales) {
        long averageSales = averageSales(sales);
        int numberMonthMin = 0;
        for (long sale : sales) {

            if (sale < averageSales)
                numberMonthMin = numberMonthMin + 1;
        }

        return numberMonthMin;
    }

    public int numberMonthMax(long[] sales) {
        long averageSales = averageSales(sales);
        int numberMonthMax = 0;
        for (long sale : sales) {

            if (sale > averageSales)
                numberMonthMax = numberMonthMax + 1;
        }

        return numberMonthMax;
    }
}
















