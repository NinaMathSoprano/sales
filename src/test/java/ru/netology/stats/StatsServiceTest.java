package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    @Test
    public void testSumSales() {
// заведём объект класса StatsService
        StatsService service = new StatsService();
// завудём массив из наших продаж
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.sumSales(sales);

        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
//  сравниваем
        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void testAverageSales() {
// заведём объект класса StatsService
        StatsService service = new StatsService();
// завудём массив из наших продаж
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
//вызываем метод averageSale
        long actual = service.averageSale(sales);

        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
//  сравниваем
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthMaximum() {
// заведём объект класса StatsService
        StatsService service = new StatsService();
// завудём массив из наших продаж
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.monthMaximumSale(sales);

        long expected = 8;
//  сравниваем
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testMonthMinimum() {
// заведём объект класса StatsService
        StatsService service = new StatsService();
// завудём массив из наших продаж
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.monthMinimumSale(sales);

        long expected = 9;
//  сравниваем
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testMonthsBellowAverage() {
// заведём объект класса StatsService
        StatsService service = new StatsService();
// заведём массив из наших продаж
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.monthsBellowAverage(sales);

        long expected = 5;
//  сравниваем
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testMonthsAboveAverage() {
// заведём объект класса StatsService
        StatsService service = new StatsService();
// заведём массив из наших продаж
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.monthsAboveAverage(sales);

        long expected = 5;
//  сравниваем
        Assertions.assertEquals(expected, actual);
    }
}
