package main.programming;

import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class FP03Exercises {

    public static void main(String[] args) {
        List<String> courses = List.of("Spring", "SpringBoot", "API", "AWS",
                "Microservices", "PCF", "Azure", "Docker", "Kubernetes");
        courses.stream()
                //.map(str->str.toUpperCase())
                .map(String::toUpperCase)
                .forEach(System.out::println);

        Supplier<String> supplier = () -> new String("sdf");
        Supplier<String> supplier1 = String::new;//constructor reference
    }

}
