package pl.zzpj2020.cleancode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Statistics {

    Map<Integer, Integer> integerMap = new HashMap<>();
    private int max = Integer.MIN_VALUE;
    private int min = Integer.MAX_VALUE;

    public Statistics(List<Integer> numbers) {
        numbers.forEach(this::addNumber);
    }

    public void addNumber(Integer number) {
        if (integerMap.containsKey(number)) {
            integerMap.put(number, integerMap.get(number) + 1);
        } else {
            integerMap.put(number, 1);
        }

        updateMinMax(number);
    }

    public void updateMinMax(int number) {
		if (number > max) {
			max = number;
		}
		if (number < min) {
			min = number;
		}
	}

    public int getValue(int key) {
        return integerMap.getOrDefault(key, 0);
    }

    public double mean() {
        double sum = 0;
        double numbers = 0;
        for (Entry<Integer, Integer> numberOccurrence : integerMap.entrySet()) {
            sum += numberOccurrence.getKey() * numberOccurrence.getValue();
            numbers += numberOccurrence.getValue();
        }
        return sum / numbers;
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

    public String getFizzBuzzNumber(int number) {
        //TODO: implement getFizzBuzzNumber
        return "";
    }
}