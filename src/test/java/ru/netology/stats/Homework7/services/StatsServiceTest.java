package ru.netology.stats.Homework7.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldGetTotalSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedTotal = 180;
        long actualTotal = service.getTotalSales(sales);

        Assertions.assertEquals(expectedTotal, actualTotal);

    }

    @Test
    public void shouldGetAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAverage = 15;
        long actualAverage = service.getAverage(sales);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void shouldCountMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMaxSales = 8;
        long actualMaxSales = service.maxSales(sales);

        Assertions.assertEquals(expectedMaxSales, actualMaxSales);
    }

    @Test
    public void shouldCountMinSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMinSales = 9;
        long actualMinSales = service.minSales(sales);

        Assertions.assertEquals(expectedMinSales, actualMinSales);
    }


    @Test
    public void shouldGetMonthsSalesUnderAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMonthsSalesUnderAverage = 5;
        long actualMonthsSalesUnderAverage = service.monthsSalesUnderAverage(sales);

        Assertions.assertEquals(expectedMonthsSalesUnderAverage, actualMonthsSalesUnderAverage);
    }

    @Test
    public void shouldGetMonthsSalesOverAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMonthsSalesOverAverage = 5;
        long actualMonthsSalesOverAverage = service.monthsSalesOverAverage(sales);

        Assertions.assertEquals(expectedMonthsSalesOverAverage, actualMonthsSalesOverAverage);
    }

}
