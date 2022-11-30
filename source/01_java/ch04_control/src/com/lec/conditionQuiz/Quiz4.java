package com.lec.conditionQuiz;

import java.util.Scanner;

//컴퓨터와 가위바위보 게임을 하는 프로그램을 구현하시오. 
//단, 사용자는 가위를 내고자 할 때는 0을 입력하고 바위를 선택하고자 할 때는 1을 입력하고, 보를 선택하고자 할 때는 2를 입력하여 게임을 진행합니다
public class Quiz4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("가위(0), 바위(1), 보(2)중 하나를 선택하세요 : ");
		int you = scanner.nextInt();
		int computer = (int)(Math.random()*3);
		if ((you +2)%3 == computer) {
			System.out.println(computer + ", you가 이김");
		}else if ((you +1)%3 == computer ) {
			System.out.println(computer + ",computer가 이김");
		}else {
			System.out.println(computer + ", 비김");
		}
		scanner.close();
	}
}
