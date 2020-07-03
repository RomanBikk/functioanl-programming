package main.chapter5;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FP04Custom {

    public static void main(String[] args) {
        List<Course> courses = List.of(
                new Course("Spring", "Framework course", 98, 20000),
                new Course("SpringBoot", "Framework course", 95, 25000),

                new Course("Microservices", "Microservices", 96, 20050),

                new Course("API", "Microservices", 92, 200430),

                new Course("AWS", "Cloud", 89, 23000),
                new Course("Azure", "Cloud", 91, 20000),
                new Course("Docker", "Cloud", 93, 20300),
                new Course("Kubernetes", "Cloud", 94, 245000)
        );

        List<Course> modifyableCourse = new ArrayList<>(courses);

        /*System.out.println(courses.stream().allMatch(course -> course.getReviewScore() > 90));
        System.out.println(courses.stream().noneMatch(course -> course.getReviewScore() < 89));
        System.out.println(courses.stream().anyMatch(course -> course.getReviewScore() == 90));
        System.out.println(courses.stream().anyMatch(course -> course.getNumberOfStudents() == 23000));
         */
        Comparator<Course> comparingByNumberOfStudentsIncreasing = Comparator.comparing(Course::getNumberOfStudents);
        Comparator<Course> comparingByNumberOfStudentsDecreasing = Comparator.comparing(Course::getNumberOfStudents).reversed();

        //System.out.println(courses.stream().sorted(comparingByNumberOfStudentsDecreasing).collect(Collectors.toList()));
        Comparator<Course> comparingByNumberOfStudentsAndReviews = Comparator.comparingInt(Course::getNumberOfStudents)
                .thenComparingInt(Course::getReviewScore).reversed();
        //System.out.println(courses.stream().sorted(comparingByNumberOfStudentsAndReviews).collect(Collectors.toList()));
        /*System.out.println(courses.stream()
                .sorted(comparingByNumberOfStudentsAndReviews)
                .limit(3).collect(Collectors.toList()));//ограничивает результат до 3 крсов
        System.out.println(courses.stream()
                .sorted(comparingByNumberOfStudentsAndReviews)
                .skip(1).collect(Collectors.toList()));//пропускает в выоде указанное число курсов

         */
       // System.out.println(courses);
       /* System.out.println(courses.stream()
                .takeWhile(course -> course.getReviewScore() >= 95)//берет все, что совподает с условием
                .collect(Collectors.toList()));
        System.out.println(courses.stream()
                .dropWhile(course -> course.getReviewScore() >= 95)//выкидывает все, что совпадает с условием
                .collect(Collectors.toList()));

        */


      /*  System.out.println(courses.stream().collect(Collectors.groupingBy(Course::getCategory)));
        System.out.println(courses.stream().collect(Collectors.groupingBy(Course::getCategory,Collectors.counting())));
        System.out.println(courses.stream().min(Comparator.comparing(Course::getReviewScore)).get());
        Map<String, Optional<Course>> collect = courses.stream()
                .collect(Collectors.groupingBy(Course::getCategory, Collectors
                        .maxBy(Comparator.comparing(Course::getReviewScore))));

       */
        createPredicateWithCutOffReviewScore(95);
        createPredicateWithCutOffReviewScore(90);

        /*System.out.println(courses.stream()
                .filter(course -> course.getName().length() > 11)
                .map(course -> course.getName().toUpperCase()).findFirst());

         */
        System.out.println(modifyableCourse.stream().map(course -> course.getName().toUpperCase()).collect(Collectors.toList()));

    }

    private static void createPredicateWithCutOffReviewScore(int cutOffReviewScore) {
        Predicate<Course> reviewScoreGreaterThan95Predicate = course -> course.getReviewScore() > cutOffReviewScore;
    }
}


class Course {
    private String name;
    private String category;
    private int reviewScore;
    private int numberOfStudents;

    public Course(String name, String category, int reviewScore, int numberOfStudents) {
        this.name = name;
        this.category = category;
        this.reviewScore = reviewScore;
        this.numberOfStudents = numberOfStudents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getReviewScore() {
        return reviewScore;
    }

    public void setReviewScore(int reviewScore) {
        this.reviewScore = reviewScore;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", reviewScore=" + reviewScore +
                ", numberOfStudents=" + numberOfStudents +
                '}';
    }
}
