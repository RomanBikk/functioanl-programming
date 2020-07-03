package main.programming;

import java.util.List;

public class FP02Structured {

    public static void main(String[] args) {
        final List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        //printEvenNumbersInListStructuredApproach(numbers);
        int sum = addListStructuredApproach(numbers);
        System.out.println(sum);
    }

    private static int addListStructuredApproach(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }

    private static void printEvenNumbersInListStructuredApproach(List<Integer> integers) {
        //How to loop the numbers?

        for (Integer integer : integers) {
            if (integer % 2 == 0) System.out.println(integer);
        }

    }
}
