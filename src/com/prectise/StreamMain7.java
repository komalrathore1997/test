package com.prectise;

import java.util.Arrays;
import java.util.List;

public class StreamMain7 {
	public static void main(String[] args) {
		
		List<Integer>list=Arrays.asList(1,2,3,4,56,6);
//		list.forEach(System.out::println);
//		list.forEach(i->doubleeit(i));
		list.forEach(StreamMain7::doubleeit);
	}
	public static void doubleeit(int i) {
		System.out.println(i*2);
	}
}
