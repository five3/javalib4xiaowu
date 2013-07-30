package com.xiaowu.test;
import static com.xiaowu.utils.BaseStatic.*;

public class TestUtils {

	/**
	 * @param args
	 */
	public static String s1 = "static string!";
	public static int i1 = 22;
	public static void main(String[] args) {
		print(Integer.toString(i1));
		print(s1);
		println(s1);
	}

}
