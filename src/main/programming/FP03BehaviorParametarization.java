package main.programming;

import java.util.List;
import java.util.Random;
import java.util.function.*;
import java.util.stream.Collectors;

public class FP03BehaviorParametarization {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        //filterAndPrint(numbers, x -> x % 2 == 0);
        //filterAndPrint(numbers, x -> x % 2 != 0);
        //filterAndPrint(numbers,x-> x%3==0);//behaviour parametarization(код метода в качестве параметра!!)
        /*List<Integer> squaredNumbers = getCollect(numbers,x->x*x);
        List<Integer> cubesNumbers = getCollect(numbers,x->x*x*x);
        System.out.println(squaredNumbers);
        System.out.println(cubesNumbers);
        Supplier<Integer> randomNumbers = () -> {
            Random random = new Random();
            return random.nextInt(1000);
        };
        System.out.println(randomNumbers.get());
         */
        /*
        UnaryOperator<Integer> unaryOperator = x -> x*3;
        System.out.println(unaryOperator.apply(3));
        BiPredicate<Integer,String> biPredicate = (number,string) ->  {
            return number <10 && string.length()<3;
        };
        System.out.println(biPredicate.test(9,"S"));
        BiFunction<Integer,String,String> biFunction = (number,string) -> number + " " + string;
        System.out.println(biFunction.apply(13, "Dallas"));
         */
        BiConsumer<String,String> biConsumer = (s1,s2) -> System.out.println(s1 + " " + s2);
        biConsumer.accept("Рома","Никита");



    }

    private static List<Integer> getCollect(List<Integer> numbers,Function<Integer,Integer> function) {
        return numbers.stream().map(function).collect(Collectors.toList());
    }

    private static void filterAndPrint(List<Integer> numbers, Predicate<Integer> oddPredicate) {
        numbers.stream().filter(oddPredicate).forEach(System.out::println);
    }


}
