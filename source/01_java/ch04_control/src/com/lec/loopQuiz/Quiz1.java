package com.lec.loopQuiz;
//1~10까지의 곱을 구해보자
public class Quiz1 {
	public static void main(String[] args) {
		int j = 1;
		for(int i=1 ; i<=10 ; i++) {
				j = j * i; //j *= i
	}
	System.out.println("1~10까지의 곱은 "+j);
//		System.out.println(j+"*"+i+"="j*i);
	}
}
