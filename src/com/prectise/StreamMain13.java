package com.prectise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain13 {
	public static void main(String[] args) {
		
		List<Integer>list=Arrays.asList(1,3,4,5,6);
		List<Integer>newList=list.stream().filter(a->a.intValue()>3)
		.peek(System.out::println)
		.collect(Collectors.toList());
		System.out.println(newList);
		
		
		Stream<String>list1=Stream.of("koaml","neha","ktiti","vishal","anuradha").filter(a->a.length()>5).
		peek(a->System.out.println("filltered values:"+a));
		System.out.println(list1);
	}
}
