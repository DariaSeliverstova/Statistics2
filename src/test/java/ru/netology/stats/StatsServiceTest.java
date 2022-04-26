package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    @Test
    void ShouldcalculateSum() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.calculateSum(sales);


        assertEquals(expected, actual);
    }

    @Test
    void ShouldAverageSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        long actual = service.averageSales(sales);


        assertEquals(expected, actual);

    }

    @Test
    void ShouldMaxSalesMoth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        long actual = service.maxSalesMoth(sales);


        assertEquals(expected, actual);
    }

    @Test
    void ShouldMinSalesMoth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        long actual = service.minSalesMoth(sales);


        assertEquals(expected, actual);
    }

    @Test
    void ShouldNumberMonthMin() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.numberMonthMin(sales);


        assertEquals(expected, actual);
    }

    @Test
    void ShouldNumberMonthMax() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.numberMonthMax(sales);


        assertEquals(expected, actual);
    }


}