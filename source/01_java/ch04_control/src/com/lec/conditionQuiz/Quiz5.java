package com.lec.conditionQuiz;

import java.util.Scanner;

//���� ��������� Ű����κ��� �Է¹޾� ������ ����ϴ� ���α׷��� �����ϼ���
public class Quiz5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �� �������� �Է����ּ��� : ");
		int month = sc.nextInt();
		switch (month) {
		case 1: case 2: case 12: 
			System.out.println("�ܿ��Դϴ�.");break;
		case 3: case 4: case 5:
			System.out.println("���Դϴ�.");break;
		case 6: case 7: case 8:
			System.out.println("�����Դϴ�.");break;
		case 9: case 10: case 11:
			System.out.println("�����Դϴ�.");break;
		default:
			System.out.println("��ȿ���� ���� �����Դϴ�");
		}
		sc.close();
	}
}
//�Ϲ������� 3��4��5���� ��, 6��7��8���� ����, 9��10��11���� ����, 12��1��2���� �ܿ��̶�� �Ѵ�. ������ �ñ�� ��ҿ� �з� ���ؿ� ���� �޶��� �� �ִ�.