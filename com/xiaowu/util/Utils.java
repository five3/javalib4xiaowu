package com.xiaowu.util;

import java.util.ArrayList;
import java.util.List;
public class Utils {
	/**
	 * @param args
	 */
	public static void print(String s){
		System.out.print(s);
	}
	
	public static void println(String... s){
		if(s.length==0){
			System.out.println();
		}else if(s.length==1){
			System.out.println(s[0]);
		}else{
			throw new IllegalArgumentException("args max length is 1");
		}		
	}

	public static void printf(String format, Object... args){
		System.out.printf(format, args);
	}
	
	public static List<Integer> range(int count, int... args){
		List<Integer> tempIntList = new ArrayList<Integer>();
		int start = 0;
		int end = 0;
		int step = 1;
		if(args.length==0){
			start = 0;
			end = count;
		}else if(args.length==1 && args[0]>count){
			start = count;
			end = args[0];
		}else if(args.length==2 && args[0]>count && args[1]>1){
			start = count;
			end = args[0];
			step = args[1];
		}else{
			return new ArrayList<Integer>();
		}
		for(int i=start; i<end; i+=step){
			tempIntList.add(new Integer(i));
		}
		return tempIntList;
	}
	
	public static void main(String[] args) {
		String s0 = "print string method";
		print(s0);
		String s1 = "println string method";
		println(s1);
		String s2 = "%s, %s, %s";
		int i0 = 22;
		printf(s2, s0, s1, i0);
		println("");
		String si = "%s, ";
		List<Integer> iarr1 = range(5);		
		for(Integer i : iarr1){
			printf(si, i);
		}
		println();
		List<Integer> iarr2 = range(5, 10);		
		for(Integer i : iarr2){
			printf(si, i);
		}
		println();
		List<Integer> iarr3 = range(10, 20, 2);		
		for(Integer i : iarr3){
			printf(si, i);
		}
		println("","");
	}

}
