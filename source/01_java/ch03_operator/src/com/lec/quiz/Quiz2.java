package com.lec.quiz;

import java.util.Scanner;

//�Է��� ���� ¦������ Ȧ������ ���
public class Quiz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int su = sc.nextInt();
		String result;
		if (su%2==0) {
			result = "¦�� �Դϴ�.";
		}else {
			result = "Ȧ�� �Դϴ�.";
		}
		System.out.println("�Է��Ͻ� �� ("+ su +")�� "+ result);
		sc.close();
	}
}
