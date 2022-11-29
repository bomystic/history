package com.lec.quiz;

import java.util.Scanner;

//나이를 입력받아 입력받은 나이가 65세 이상일 때, “경로우대” 출력, 아니면 “일반”출력
public class Quiz4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int su = sc.nextInt();
		String result;
		if (su>=65) {
			result = "경로우대";
		}else {
			result = "일반";
		}
		System.out.println("해당 나이는 "+result+ " 입니다" );
		sc.close();
	}
}
