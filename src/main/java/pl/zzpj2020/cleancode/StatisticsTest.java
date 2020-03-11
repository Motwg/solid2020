package pl.zzpj2020.cleancode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class StatisticsTest {

    @Test
    public void meanTest() {
        List<Integer> numbers = Arrays.asList(1, 1, 2, 3);
        Statistics stats = new Statistics(numbers);
        Assert.assertTrue(1.75 == stats.mean());
    }

    @Test
    public void minMaxTest() {
        List<Integer> numbers = Arrays.asList(1, 1, 2, 3, 7);
        Statistics stats = new Statistics(numbers);
        Assert.assertTrue(1 == stats.getMin());
        Assert.assertTrue(7 == stats.getMax());
    }
}
