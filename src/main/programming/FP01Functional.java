package main.programming;

import java.util.List;
import java.util.stream.Stream;

public class FP01Functional {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        //printEvenNumbersInListFunctionalApproach(numbers);
        //printOddNumbersInListFunctionalApproach(numbers);
        //printSquaresOfEvenNumbersInListFunctionalApproach(numbers);
        //printCubeOfOddNumbersInListFunctionalApproach(numbers);
        //printSumOfCubesInListFunctionalApproach(numbers);
        printDistinctOfListFunctionalApproach(numbers);
        //printSortedListFunctionalApproach(numbers);


    }

    /*private static void  print(int number) {
        System.out.println(number);
    }

     */

    private static void printAllNumbersInListFunctionalApproach(List<Integer> numbers) {
        //What to do?
        //сделать из List нужный Stream of numbers
        //[12,9,13,4,6,2,4,12,15]
        //12
        //9
        //13
        //4
        //6
        //...
        numbers.stream().forEach(System.out::println);//method reference(ссылка на метод)

    }

    /*
    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

     */

    private static void printEvenNumbersInListFunctionalApproach(List<Integer> numbers) {

        numbers.stream()
                //.filter(FP01Functional::isEven)//Filter - only allow even numbers
                .filter(number -> number %2 == 0)//Lamdba expression
                .forEach(System.out::println);//method reference(ссылка на метод)

    }

    private static void printOddNumbersInListFunctionalApproach(List<Integer> numbers) {

        numbers.stream()
                //.filter(FP01Functional::isOdd)//Filter - only allow even numbers
                .filter(number -> number %2 != 0)//Lamdba expression
                .forEach(System.out::println);//method reference(ссылка на метод)

    }

    private static void printSquaresOfEvenNumbersInListFunctionalApproach(List<Integer> numbers) {

        numbers.stream()
                //.filter(FP01Functional::isOdd)//Filter - only allow even numbers
                .filter(number -> number %2 == 0)//Lamdba expression
                .map(number -> number * number)//mapping - x -> x * x
                .forEach(System.out::println);//method reference(ссылка на метод)

    }

    private static void printCubeOfOddNumbersInListFunctionalApproach(List<Integer> numbers) {

        numbers.stream()
                //.filter(FP01Functional::isOdd)//Filter - only allow even numbers
                .filter(number -> number % 2 != 0)//Lamdba expression
                .map(number -> number * number * number)//mapping - x -> x * x
                .forEach(System.out::println);//method reference(ссылка на метод)

    }

    private static void printSumOfCubesInListFunctionalApproach(List<Integer> numbers) {
        System.out.println(numbers.stream().map(x -> x * x * x).reduce(0, Integer::sum));
    }

    //печатает значения без дубликатов
    private static void printDistinctOfListFunctionalApproach(List<Integer> numbers) {
        numbers.stream().distinct().sorted().forEach(System.out::println);
    }

    private static void printSortedListFunctionalApproach(List<Integer> numbers) {
        numbers.stream().sorted().forEach(System.out::println);
    }



}
