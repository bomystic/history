package com.lec.conditionQuiz;

import java.util.Scanner;

//��ǻ�Ϳ� ���������� ������ �ϴ� ���α׷��� �����Ͻÿ�. 
//��, ����ڴ� ������ ������ �� ���� 0�� �Է��ϰ� ������ �����ϰ��� �� ���� 1�� �Է��ϰ�, ���� �����ϰ��� �� ���� 2�� �Է��Ͽ� ������ �����մϴ�
public class Quiz4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("����(0), ����(1), ��(2)�� �ϳ��� �����ϼ��� : ");
		int you = scanner.nextInt();
		int computer = (int)(Math.random()*3);
		if ((you +2)%3 == computer) {
			System.out.println(computer + ", you�� �̱�");
		}else if ((you +1)%3 == computer ) {
			System.out.println(computer + ",computer�� �̱�");
		}else {
			System.out.println(computer + ", ���");
		}
		scanner.close();
	}
}
