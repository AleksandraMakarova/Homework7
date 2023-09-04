package ru.netology.stats.Homework7.services;

public class StatsService {

    public long getTotalSales(long[] sales) {
        long totalSales = 0;

        for (long element : sales) {
            totalSales += element;
        }

        return totalSales;
    }

    public long getAverage(long[] sales) {
        return getTotalSales(sales) / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }


    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int monthsSalesUnderAverage(long[] sales) {
        int underAverage = 0;
        long averageSale = getAverage(sales);

        for (long sale : sales) {
            if (sale < averageSale) {
                underAverage += 1;
            }
        }
        return underAverage;
    }

    public int monthsSalesOverAverage(long[] sales) {
        int overAverage = 0;
        long averageSale = getAverage(sales);

        for (long sale : sales) {
            if (sale > averageSale) {
                overAverage += 1;
            }
        }
        return overAverage;
    }


}




