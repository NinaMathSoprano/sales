package ru.netology.stats;

public class StatsService {
    // создаём метод, принимающий массив наших продаж и считающий сумму наших продаж

    public long sumSales(long[] sales) {
        //  заводим переменную, куда будем вкладывать наше содержимое, пробегаем все элементы массива и поочереди складываем с этой переменной
        long totalSale = 0;
        // перебираем в цикле все продажи. используем цикл без счётчика. нам не нужен счётчик, нам надо просто брать элемент массива и помещать его в переменную
        for (long sale : sales) {
// рассмотрим цикл по массиву sales, состоящий из элементов, которые мы назовём sale , и они типа long
            totalSale += sale;
        }
        return totalSale;
    }

    public long averageSale(long[] sales) {
// вызываем метод sumSales и передаём туда массив, чтоб не повторять цикл и здесь. В переменную totalSale мы сохраняем результат работы выражения, стоящего справа
//                long totalSale = sumSales(sales);
// результат этого метода(как функции) сразу разделим на 12, поэтому верхнюю строчку с объявлением переменной totalSale можно удалить теперь

        return sumSales(sales) / sales.length;
// делим сумму продаж на длину массива
    }

    public int monthMaximumSale(long[] sales) {
// мы делаем предположение, что наш первый месяц и есть день максимума продаж, т.е. первая ячейка массива
        int monthMaximum = 0;
// далее мы в цикле перебираем все ячейки массива и обязательно надо знать номер этой ячейки
// название массива, точка fori и нажимаем enter
        for (int i = 0; i < sales.length; i++) {
            // если продажи в текущий месяц monthMaximum меньше продаж с следующей ячейке, то максимальная продажа теперь в новой ячейке
            if (sales[monthMaximum] <= sales[i]) {
                monthMaximum = i;

            }

        }
        return monthMaximum + 1;
    }

    public int monthMinimumSale(long[] sales) {
// мы делаем предположение, что наш первый месяц и есть день минимума продаж, т.е. первая ячейка массива
        int monthMinimum = 0;
// далее мы в цикле перебираем все ячейки массива и обязательно надо знать номер этой ячейки
// название массива, точка fori и нажимаем enter
        for (int i = 0; i < sales.length; i++) {
            // если продажи в текущий месяц monthMinimum больше продаж ,чем в следующей ячейке, то минимальная продажа теперь в новой ячейке
            if (sales[monthMinimum] >= sales[i]) {
                monthMinimum = i;

            }

        }
        return monthMinimum + 1;
    }

    public int monthsBellowAverage(long[] sales) {
        int counter = 0;
        // заранее расчитаем продажу и вызовем метод average sale
        long average = averageSale(sales);
        // перебираем все месяцы
        for (long sale : sales) {
            if (sale < average) {
// тогда мы увеличиваем счётчик
                counter++;
            }
        }
        return counter;
    }

    public int monthsAboveAverage(long[] sales) {
        int counter = 0;
        // заранее расчитаем продажу и вызовем метод average sale
        long average = averageSale(sales);
        // перебираем все месяцы
        for (long sale : sales) {
            if (sale > average) {
// тогда мы увеличиваем счётчик
                counter++;
            }
        }
        return counter;
    }
}
