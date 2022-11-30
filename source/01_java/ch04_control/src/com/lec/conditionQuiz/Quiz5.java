package com.lec.conditionQuiz;

import java.util.Scanner;

//현재 몇월인지를 키보드로부터 입력받아 계절을 출력하는 프로그램을 구현하세요
public class Quiz5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("현재 몇 월인지를 입력해주세요 : ");
		int month = sc.nextInt();
		switch (month) {
		case 1: case 2: case 12: 
			System.out.println("겨울입니다.");break;
		case 3: case 4: case 5:
			System.out.println("봄입니다.");break;
		case 6: case 7: case 8:
			System.out.println("여름입니다.");break;
		case 9: case 10: case 11:
			System.out.println("가을입니다.");break;
		default:
			System.out.println("유효하지 않은 계절입니다");
		}
		sc.close();
	}
}
//일반적으로 3·4·5월을 봄, 6·7·8월을 여름, 9·10·11월을 가을, 12·1·2월을 겨울이라고 한다. 계절의 시기는 장소와 분류 기준에 따라 달라질 수 있다.