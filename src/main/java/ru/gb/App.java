package ru.gb;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;


/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
        int[] inputArray = new int[] {1,2,3,4,5};
        
        // Get a DescriptiveStatistics instance
        DescriptiveStatistics stats = new DescriptiveStatistics();

        // Add the data from the array
        for( int i = 0; i < inputArray.length; i++) {
                stats.addValue(inputArray[i]);
        }

        // Compute some statistics
        double mean = stats.getMean();
        double std = stats.getStandardDeviation();
        double median = stats.getPercentile(50);

        System.out.println(mean + " " + std + " " + median);

        System.out.println("Привет!");
    }
}
