package ru.netology.stats.Homework7.services;

public class StatsService {

    public int getTotalSales (long[] sales){
        int totalSales = 0;

        for (long element : sales) {
            totalSales += element;
        }

        return totalSales;
    }

    public int getAverage (long[] sales){
        return getTotalSales(sales) / sales.length;

    }

    public int maxSales (long[] sales){
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }


    public int minSales (long[] sales){
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int monthsSalesUnderAverage (long[] sales){
        int underAverage = 0;
        for (long sale : sales) {
            if (sale < getAverage(sales)) {
                underAverage += 1;
            }
        }
        return underAverage;

        }

    public int monthsSalesOverAverage (long[] sales){
        int overAverage = 0;
        for (long sale : sales) {
            if (sale > getAverage(sales)) {
                overAverage += 1;
            }
        }
        return overAverage;

    }


}




