package main.programming;

import java.util.List;

public class FP01Structured {

    public static void main(String[] args) {
        printEvenNumbersInListStructuredApproach(List.of(12,9,13,4,6,2,4,12,15));
    }

    private static void printEvenNumbersInListStructuredApproach(List<Integer> integers) {
        //How to loop the numbers?

        for (Integer integer : integers) {
            if (integer % 2 == 0) System.out.println(integer);
        }

    }
}
