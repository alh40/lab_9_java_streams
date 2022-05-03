package org.example.streamapi;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MVP {

    /*
        Convert a List<String> to an object stream and for each element -> System,out.println.
     */

    public void printNames(List<String> names) {
        // Implement me :)

        names.stream().forEach(System.out::println);

    }

    /*
        Given a List<Integers>, return a List<Integer> with event numbers.
     */
    public List<Integer> returnEvenNumbers(List<Integer> numbers) {
        // Implement me :)

        List<Integer> evenNumbers = numbers.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());

        return evenNumbers;
    }

    /*
        Given an int [], double the value of each int and return an int [].
    */
    public int[] doubleInts(int[] numbers) {
        // Implement me :)

        int[] doubleNumber = Arrays.stream(numbers).map(i -> i*2).toArray();

        return doubleNumber;
    }

    /*
        Given a String, return a List<String>, all caps.
     */
    public List<String> splitToAllCapsList(String input) {
        // Implement me :)

      List<String> allCaps = Arrays.asList(input.split(""));

      allCaps.replaceAll(String::toUpperCase);
        return allCaps;
    }

    /*
    Given a list of animals:
     - filter the ones that start with a given letter
     - return sorted List<String>, all caps.
    */
    public List<String> filterByFirstLetterAndOrder(List<String> list, String letter) {
        // Implement me :)

        List<String> sortedAnimals = list.stream().filter(i -> i.startsWith(letter))
                .map(i -> i.toUpperCase())
                .collect(Collectors.toList());

        return sortedAnimals;
    }

    /*
        Given a list of words, return elements that:
         - are shorter than the given number and
         - start with a given letter.
    */
    public List<String> filterWords(List<String> words, int maxLength, String firstLetter) {
        // Implement me :)

        List<String> filteredWords = words.stream()
                .filter(i -> i.startsWith(firstLetter) && i.length() < maxLength)
                .collect(Collectors.toList());

        return filteredWords;
    }
}