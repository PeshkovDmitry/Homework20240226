package ru.gb.statistician;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

public class Statistician implements StatisticianBehavior{

    DescriptiveStatistics stats;

    public Statistician() {
        stats = new DescriptiveStatistics();
    }

    @Override
    public void addResult(int result) {
        stats.addValue(result);
    }

    @Override
    public void printStatistics() {
        long count = stats.getN();
        long win = Math.round(stats.getSum());
        double percentOfWin = stats.getMean();
        System.out.printf(
            "Проведено %d игр, из них выиграно %d. Процент выигрыша - %f\n\r", count, win, percentOfWin);
    }
    
}
