package com.lec.conditionQuiz;

import java.util.Scanner;
//���� �Է¹޾� ���밪�� ����ϴ� ���α׷�
public class Quiz1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է��ϼ��� : ");
		int num = sc.nextInt();
		int score = (int)(Math.abs(num));
		System.out.println("�Է��� ���� ���밪�� : " + score );
		sc.close();
	}
}
