package com.yedam.java.ch01;

public class Main {

	public static void main(String[] args) {
		// 람다식 : (매개변수, ...) -> {실행문}
		// @FunctionalInterface

		// 리턴 타입이 없는 람다식
		MyFunctionalInterfaceA fa;

		fa = new MyFunctionalInterfaceA() {
			@Override
			public void method() {
				System.out.println("익명 구현 객체입니다.");
			}
		};
		fa.method();

		fa = () -> {
			String str = "method call1";
			System.out.println(str);
		};
		fa.method();

		fa = () -> System.out.println("람다식 표현법");
		fa.method();

		// 매개 변수가 있는 람다식

		MyFunctionalInterfaceB fb;

		fb = new MyFunctionalInterfaceB() {
			@Override
			public void method(int x) {
				System.out.println(x + 5);
			}
		};

		fb.method(2);

		fb = (x) -> {
			int result = x * 5;
			System.out.println(result);
		};
		
		fb.method(10);
		
		fb = x -> System.out.println(x*5);
		fb.method(3);
		
		//리턴 값이 있는 람다식
		MyFunctionalInterfaceC fc;
		
		fc = new MyFunctionalInterfaceC() {
			@Override
			public int method(int x, int y) {
				return x + y;
			}
		};
		System.out.println(fc.method(1, 2));
		
		fc = (x,y) -> {
			int result = x + y;
			return result;
		};
		
		System.out.println(fc.method(1, 2));
		
		fc = (x, y) ->  x + y;
		System.out.println(fc.method(1, 2));
		fc = (x, y) -> {return x + y;};
		fc = (x, y) -> x + y;
		fc = (x, y) -> sum(x,y);
	
		MyNumber max = (x,y) -> {return (x>=y)? x:y;};
		System.out.println(max.getMax(10, 20));
	
	}
	
	public static int sum(int x, int y) {
		return (x + y);
	}
}
