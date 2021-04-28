package com.nmw;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class FindDuplicateStream {

    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);

        //System.out.print((findDuplicateNumber(stream)));
        System.out.print((findDuplicateNumberMethod2(stream)));
    }

    private static Set<Integer> findDuplicateNumberMethod2(Stream<Integer> stream) {
        return  null;
    }

    private static Set<Integer> findDuplicateNumber(Stream<Integer> stream) {

        Set set = new HashSet();
        return stream.filter(n -> ! set.add(n)).collect(Collectors.toSet());

    }

}
