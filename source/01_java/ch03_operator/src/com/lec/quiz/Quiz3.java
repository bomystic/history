package com.lec.quiz;
//�μ��� �Է¹޾� �� ���� ������ ����� O�� X�� ���. ù��° ���� �� ū�� ����� O�� X�� ����Ѵ�

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ������ �Է��ϼ��� : ");
		int su1 = sc.nextInt();
		System.out.print("�ι�° ������ �Է��ϼ��� : ");
		int su2 = sc.nextInt();
		String result = (su1==su2)? "O":"X";
		System.out.println("�Է��� �� ���� ������? "+result);
		String result1 = (su1>su2)? "O":"X";
		System.out.println("�Է��� ù��° ������ �� ū����? "+result1);
		sc.close();
	}
}
