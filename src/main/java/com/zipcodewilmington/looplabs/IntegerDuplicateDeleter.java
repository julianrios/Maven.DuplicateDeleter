package com.zipcodewilmington.looplabs;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by leon on 1/29/18.
 *
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {

    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

//    @Override
//    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
//        Stream<Integer> arraywithoutDupes = Arrays.stream(array).filter(integer ->
//             getCount(integer) < maxNumberOfDuplications
//        );
//        Integer[] deletedDupe = arraywithoutDupes.toArray(Integer[]::new);
//        return deletedDupe;
//    }
//
//    @Override
//    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
//        Stream<Integer> arrayWithoutDupes = Arrays.stream(array).filter(integer ->
//             getCount(integer) != exactNumberOfDuplications
//        );
//        Integer[] deletedDupe = arrayWithoutDupes.toArray(Integer[]::new);
//        return deletedDupe;
//    }
//
//    private int getCount(Integer intToCheck) {
//        int count = 0;
//        for (Integer element : array) {
//            if (element.equals(intToCheck)) {
//                count++;
//            }
//        }
//        return count;
//    }
}
