package main.programming;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class FP02Functional {

    public static void main(String[] args) {
        final List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        List<Integer> doubleNumbers = doubleList(numbers);
        List<Integer> evenNumbers = evenNumbersList(numbers);
        //printEvenNumbersInListStructuredApproach(numbers);
        int sum = addListFunctionalApproach(numbers);
        //System.out.println(doubleNumbers);
        System.out.println(sum);

    }

    private static List<Integer> doubleList(List<Integer> numbers) {
        return numbers.stream().map(number -> number * number).collect(Collectors.toList());
    }

    private static List<Integer> evenNumbersList(List<Integer> numbers) {
        return numbers.stream().filter(number -> number % 2 ==0).collect(Collectors.toList());
    }

    private static int sum(int aggregate, int nextNumber) {
        System.out.println(aggregate + " " + nextNumber);
        return aggregate + nextNumber;
    }

    private static int addListFunctionalApproach(List<Integer> numbers) {
       //return numbers.stream().reduce(0,FP02Functional::sum);
        BinaryOperator<Integer> sum = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        };
        return numbers.stream()
                //.reduce(0, (x,y) -> x + y);
                  .reduce(0, sum);
    }


}
