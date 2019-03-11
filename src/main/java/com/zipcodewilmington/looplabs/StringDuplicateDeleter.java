package com.zipcodewilmington.looplabs;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {

    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        Stream<String> arrayWithoutDupes = Arrays.stream(array).filter(word ->
                getCount(word) < maxNumberOfDuplications
        );
        String[] deletedDupe = arrayWithoutDupes.toArray(String[]::new);
        return deletedDupe;

    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        Stream<String> arrayWithoutDupes = Arrays.stream(array).filter(word ->
                getCount(word) != exactNumberOfDuplications
        );
        String[] deletedDupe = arrayWithoutDupes.toArray(String[]::new);
        return deletedDupe;
    }

    private int getCount(String stringToCheck) {
        int count = 0;
        for (String element : array) {
            if (element.equals(stringToCheck)) {
                count++;
            }
        }
        return count;
    }
}
