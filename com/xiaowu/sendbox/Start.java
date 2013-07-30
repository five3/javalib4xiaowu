package com.xiaowu.sendbox;

public class Start{
	static String s1 = "static string";
	String s2 = "non-static string";
	static String[] b = {"111","222","333"};
	static void show(){
		System.out.println(s1);
	}
	public static void main(String[] args){				
		for(String s : b){
			System.out.println(s);
		}
		show();
		System.out.println(Start.s1);
		System.out.println(new Start().s2);
	}
}
