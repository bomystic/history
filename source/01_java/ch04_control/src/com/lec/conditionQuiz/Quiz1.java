package com.lec.conditionQuiz;

import java.util.Scanner;
//수를 입력받아 절대값을 출력하는 프로그램
public class Quiz1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하세요 : ");
		int num = sc.nextInt();
		int score = (int)(Math.abs(num));
		System.out.println("입력한 수의 절대값은 : " + score );
		sc.close();
	}
}
