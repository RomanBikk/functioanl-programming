package main.programming;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FP01Exercises {

    public static void main(String[] args) {
        List<String> courses = List.of("Spring","SpringBoot","API","AWS","Microservices","PCF","Azure","Docker","Kubernetes");
        //printAllCoursesInListFunctionalApproach(courses);
        //printSpringCoursesInListFunctionalApproach(courses);
        //printCoursesWithAtLeast4LettersFunctionalApproach(courses);
        //printNumberOfCharInCourseFunctionalApproach(courses);
        //printCoursesInReversOrderFunctionalApproach(courses);
        //printCoursesInOwnOrderFunctionalApproach(courses);
        List<Integer> titleLength = listOfLengthOfCourseTitle(courses);
        System.out.println(titleLength);

    }

    private static void printAllCoursesInListFunctionalApproach(List<String> courses) {

        courses.stream().forEach(System.out::println);
    }

    private static void printSpringCoursesInListFunctionalApproach(List<String> courses) {
        courses.stream()
                .filter(course -> course.contains("Spring"))
                .forEach(System.out::println);
    }

    private static void printCoursesWithAtLeast4LettersFunctionalApproach(List<String> courses) {
        courses.stream()
                .filter(course -> course.length() >= 4)
                .forEach(System.out::println);
    }

    private static void printNumberOfCharInCourseFunctionalApproach(List<String> courses) {
        courses.stream()
                .map(course -> course + " " + course.length())
                .forEach(System.out::println);
    }

    private static void printCoursesInReversOrderFunctionalApproach(List<String> courses) {
        courses.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

    }

    private static void printCoursesInOwnOrderFunctionalApproach(List<String> courses) {
        courses.stream().sorted(Comparator.comparing(x -> x.length())).forEach(System.out::println);
    }

    private static List<Integer> listOfLengthOfCourseTitle(List<String> courses) {
        return courses.stream().map(String::length).collect(Collectors.toList());
    }
}
