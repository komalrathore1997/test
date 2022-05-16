package com.prectise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamMain9 {
    public static void main(String[] args) {
		 Stream.iterate(1, element->element+1)
		 .filter(element->element%5==0)
		 .limit(10)
		 .forEach(System.out::println);
	}
}
