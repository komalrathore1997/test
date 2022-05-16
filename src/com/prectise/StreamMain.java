package com.prectise;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
		List<Integer>list1=new ArrayList<>();
		list1.add(3);
		list1.add(43);
		list1.add(35);
		list1.add(37);
		list1.add(32);
		list1.stream().forEach(e->{System.out.println(e);});
	}
}
