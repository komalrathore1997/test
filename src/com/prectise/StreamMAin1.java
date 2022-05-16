package com.prectise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMAin1 {
	public static void main(String[] args) {

		// create a list and fillter all even form list
		List<Integer> list = List.of(2, 3, 4, 5, 67);
		List<Integer> list1 = new ArrayList<>();
		list1.add(13);
		list1.add(3);
		list1.add(2);
		list1.add(24);
		list1.add(13);
		list1.add(5);
		//without Stream
		List<Integer> listeven = new ArrayList<>();
		for (Integer i : list) {
			if (i % 2 == 0) {
				listeven.add(i);
			}
		}
		System.out.println(list);
		System.out.println(listeven);
		//with Stream
		Stream<Integer>stream=list1.stream();
		List<Integer>newList=stream.filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(newList);
	}

}
