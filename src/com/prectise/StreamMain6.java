package com.prectise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class StreamMain6 {
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5);

		/*
		 * for(int i=0;i<5;i++) { System.out.println(values.get(i)); }
		 */

		/*
		 * Iterator<Integer>i=values.iterator(); while(i.hasNext()) {
		 * System.out.println(i.next()); }
		 */ 

		/*
		 * for(int i:values) { System.out.println(i); }
		 */

//		External Iteration

		//		Internal Iteration
		
		/* */
		/*
		 * values.forEach(i->System.out.println(i));
		 * 
		 * values.forEach(new Consumer<Integer>() { public void accept(Integer i) {
		 * System.out.println(i); } });
		 */

	}
}
