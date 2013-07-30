package com.xiaowu.sendbox;

public class Calc {

	/**
	 * @param args
	 */
	private double result = 0.0;
	
	public void add(int i){
		result += i;
	}
	
	public void sub(int i){
		result -= i;
	}
	
	public void mup(int i){
		result *= i;
	}
	
	public void div(int i){
		if(i==0){
			System.out.println("除数不能为0");
			return;
		}
		result /= i;
	}
	
	public void mod(int i){
		result %= i;
	}
	
	public double getResult(){
		return result;	
	}

	public void reset(){
		result = 0.0;
	}
	
	public static void main(String[] args) {
		Calc calc = new Calc();
		calc.add(1);
		System.out.println(calc.getResult());
		calc.sub(2);
		System.out.println(calc.getResult());
		calc.mup(3);
		System.out.println(calc.getResult());
		calc.div(4);
		System.out.println(calc.getResult());
		calc.div(0);
		System.out.println(calc.getResult());
		calc.mod(5);
		System.out.println(calc.getResult());
		calc.reset();
		System.out.println(calc.getResult());
	}
}
