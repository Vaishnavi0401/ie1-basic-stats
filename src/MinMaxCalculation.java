// package Models;

import java.util.List;

public class MinMaxCalculation {
    public static int[] findMinMax(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("The list of numbers cannot be null or empty");
        }

        int min = numbers.get(0);
        int max = numbers.get(0);

        return new int[]{min, max};
    }
}
