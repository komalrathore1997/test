package com.prectise;

import java.util.ArrayList;
import java.util.List;

public class StreamMain8 {
    public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<=100;i++) {
			list.add(i);
		}
		list.forEach(System.out::println);
		list.forEach(StreamMain8::square);
	}
    public static void square(int i) {
    	System.out.println(i*i);
    	
    }
}
