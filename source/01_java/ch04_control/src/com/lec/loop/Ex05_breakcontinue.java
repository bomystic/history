package com.lec.loop;

public class Ex05_breakcontinue {
	public static void main(String[] args) {
		for(int i=1 ; i<=5 ;i++) { //i<=5 가 없으면 무한반복문으로 빠질수있음 주의
			if(i==3)
				//break; // 반복문 출력을 빠져 나감
				continue; // 증감식으로 올라감
			System.out.println(i);
		}//for
	}//main
}//class
