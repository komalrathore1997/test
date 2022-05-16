package com.prectise;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain2 {
    public static void main(String[] args) {
		List<Integer> list=List.of(2,3,5,78,96,3);
		List<Integer>newList=list.stream().filter(i->i>40).collect(Collectors.toList());
		System.out.println(list);
		System.out.println(newList);
		
	}
}
