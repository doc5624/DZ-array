package ru.netology.stats;

public class StatsService {

    public long summSales(long[] sales) {
        long summaAll = 0;

        for (int i = 0; i < sales.length; i++) {
            summaAll = summaAll + sales[i];
        }

        return summaAll;
    }

    public long mediumSales(long[] sales) {
        long medSales = 0;

        long summaAll = summSales(sales);

        medSales = summaAll / (sales.length);

        return medSales;
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

    public int minMediumSales(long[] sales) {
        int minMedMonth = 0;

        long medSales = mediumSales(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < medSales) {
                minMedMonth = minMedMonth + 1;
            }
        }

        return minMedMonth;
    }

    public int maxMediumSales(long[] sales) {
        int maxMedMonth = 0;

        long medSales = mediumSales(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > medSales) {
                maxMedMonth = maxMedMonth + 1;
            }
        }

        return maxMedMonth;
    }
}
