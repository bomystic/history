package com.lec.quiz;

import java.util.Scanner;

//국어, 영어, 수학 점수를 사용자에게 입력받아, 각 점수를 출력하고 총점, 평균(소수점2자리까지) 출력하는 프로그램을 구현 하시오
public class Quiz5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수를 입력하세요 : ");
		int su1 = sc.nextInt();
		System.out.print("영어 점수를 입력하세요 : ");
		int su2 = sc.nextInt();
		System.out.print("수학 점수를 입력하세요 : ");
		int su3 = sc.nextInt();
		int tot = su1 + su2 + su3;
		double avg = (double)tot /3;
		System.out.println("국어 :"+su1+"\t영어 : "+su2+"\t수학 : "+su3);
		System.out.printf("총점 : %d\t평균 : %.2f\n",tot, avg);
	}
}
