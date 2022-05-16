package com.prectise;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.DoubleStream;

public class ClassA {
    public static void main(String[] args) {
//    	DoubleStream s = DoubleStream.of(1.2, 2.4);
//    	s.peek(System.out::println).filter(x -> x > 2).count();
		Predicate<Integer>pr=a->(a>18);
		System.out.println(pr.test(19));
	}
}
