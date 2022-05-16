package com.prectise;

import java.util.stream.Stream;

public class StreamMethod13 {
	public static void main(String[] args) {
//		
//		Stream<String>stream=Stream.of("black bear","brown bear","grizzly");
//		long count=stream.filter(s->s.startsWith("g"))
//				.peek(System.out::println).count();
//		System.out.println(count);	
		
		Stream<String> stream=Stream.iterate("",(s)->s+1 );
		System.out.println(stream.limit(2).map(x->x+"2"));
				
		}
}
