package com.keithwedinger;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Java 8 Streams
 *
 * @author Keith Wedinger <br>
 * Created On: 2/11/18
 */

public class Streams {
    public static void main(String argv[]) throws Exception {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> twoEvenSquares =
                numbers.stream()
                        .filter(n -> {
                            System.out.println("filtering " + n);
                            return n % 2 == 0;
                        })
                        .map(n -> {
                            System.out.println("mapping " + n);
                            return n * n;
                        })
                        .sorted(Comparator.reverseOrder())
                        .limit(3)
                        .collect(Collectors.toList());
        System.out.println(twoEvenSquares);

        final String inputFilePath = "/Users/kwedinger/projects/git/codingchallenges/src/main/resources/creditcardnumbers.txt";
        Stream<String> inputLinesStream = Files.lines(Paths.get(inputFilePath), Charset.defaultCharset());
//        List<String> filteredResults = inputLinesStream
//                .filter(line -> {
//                    return line.startsWith("9");
//                })
//                .sorted()
//                .collect(Collectors.toList());
//        System.out.println(filteredResults);

        inputLinesStream
                .filter(line -> {
                    return line.startsWith("08");
                })
                .findAny()
                .ifPresent(System.out::println);
    }
}
