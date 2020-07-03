package main.chapter5;

import java.util.Date;
import java.util.stream.LongStream;

public class FP05Parallelizing {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(LongStream.range(0, 1000000000).parallel().sum());
        System.out.println(System.currentTimeMillis() - start);
    }
}
