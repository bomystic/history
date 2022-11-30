package com.lec.loopQuiz;

import java.util.Scanner;

//컴퓨터와 가위바위보 게임을 -1을 입력할때까지 무한반복하는 게임을 작성하시오.
//(단, 가위대신 0, 바위대신 1, 보대신 2, 종료를 원하면 -1을 입력합니다)
public class homework1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int you, computer;
		while(true) {
			System.out.println("가위(0),바위(1),보(2) 중 하나를 선택하세요.(종료는: -1) : ");
			you = sc.nextInt();
			if(you==-1) break;
			computer = (int)(Math.random()*3);
			
			
		}
	}
}
