package com.lec.quiz;
//두수를 입력받아 두 수가 같은지 결과를 O나 X로 출력. 첫번째 수가 더 큰지 결과를 O나 X로 출력한다

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하세요 : ");
		int su1 = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		int su2 = sc.nextInt();
		String result = (su1==su2)? "O":"X";
		System.out.println("입력한 두 수가 같나요? "+result);
		String result1 = (su1>su2)? "O":"X";
		System.out.println("입력한 첫번째 정수가 더 큰가요? "+result1);
		sc.close();
	}
}
